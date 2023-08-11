import pandas as pd
import matplotlib.pyplot as plt
from reportlab.lib.pagesizes import letter
from reportlab.lib import colors
from reportlab.lib.styles import getSampleStyleSheet
from reportlab.platypus import SimpleDocTemplate, Paragraph, Spacer, Image, Table, TableStyle
from io import BytesIO

# Ruta al archivo Excel
archivo_excel = 'C:/Users/horac/Desktop/0baseCompbts 07-2023.xlsx'

# Cargar el archivo Excel en un DataFrame de pandas
datos = pd.read_excel(archivo_excel)

# Mostrar los primeros registros para verificar la carga
print(datos.head())





df_ventas = pd.DataFrame(datos)

# Convertir la columna 'Fecha' a tipo datetime
df_ventas['Fecha'] = pd.to_datetime(df_ventas['Fecha Comprobante'])

# Agrupar las ventas por fecha, sucursal y sumar los bultos
ventas_agrupadas = df_ventas.groupby(['Descripción Sucursal', 'Fecha'])['Bultos Total'].sum().reset_index()

# Mostrar el total de ventas por sucursal
print(ventas_agrupadas)


# Crear un gráfico de barras
plt.figure(figsize=(10, 6))
plt.bar(ventas_agrupadas['Descripción Sucursal'], ventas_agrupadas['Bultos Total'])
plt.xlabel('Sucursal')
plt.ylabel('Total de Ventas')
plt.title('Total de Ventas por Sucursal')
plt.xticks(rotation=45, ha='right')  # Rotar etiquetas del eje x para mayor legibilidad

# Guardar el gráfico en un archivo temporal
temp_image = BytesIO()
plt.savefig(temp_image, format='png')
temp_image.seek(0)
plt.close()

# Crear el PDF con el gráfico y otros elementos
nombre_informe_pdf = 'informe_ventas.pdf'
buffer = BytesIO()

doc = SimpleDocTemplate(buffer, pagesize=letter)

styles = getSampleStyleSheet()
elements = []
elements.append(Paragraph('Informe de Ventas por Sucursal', styles['Title']))

# Insertar el gráfico desde el archivo temporal
image = Image(temp_image, width=400, height=250)
elements.append(image)

# Agregar una tabla con los datos de ventas por sucursal
data = [['Sucursal', 'Total de Ventas']]
for index, row in df_ventas.iterrows():
    data.append([row['Descripción Sucursal'], row['Bultos Total']])

table = Table(data, colWidths=[200, 200])
table.setStyle(TableStyle([('BACKGROUND', (0, 0), (-1, 0), colors.grey),
                           ('TEXTCOLOR', (0, 0), (-1, 0), colors.whitesmoke),
                           ('ALIGN', (0, 0), (-1, -1), 'CENTER'),
                           ('FONTNAME', (0, 0), (-1, 0), 'Helvetica-Bold'),
                           ('BOTTOMPADDING', (0, 0), (-1, 0), 12),
                           ('BACKGROUND', (0, 1), (-1, -1), colors.beige),
                           ('GRID', (0, 0), (-1, -1), 1, colors.black)]))
elements.append(table)

doc.build(elements)

# Guardar el PDF en un archivo
with open(nombre_informe_pdf, 'wb') as pdf_file:
    pdf_file.write(buffer.getvalue())