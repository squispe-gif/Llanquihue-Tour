# LlanquihueTourApp

## Descripción

Sistema de gestión de tours para la agencia **Llanquihue Tour**, ubicada en la Región de Los Lagos. El programa lee una lista de tours desde un archivo `.txt`, los carga en un `ArrayList` de objetos Java y permite recorrer y filtrar el catálogo según tipo y precio.

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos I (PRY2202)** — Semana 4.

---

## Estructura de carpetas

```
LlanquihueTourApp/
├── src/
│   ├── model/
│   │   └── Tour.java          # Clase que representa un tour
│   ├── data/
│   │   └── GestorDatos.java   # Lee el archivo y carga los objetos en ArrayList
│   └── ui/
│       └── Main.java          # Clase principal con recorrido y filtros
└── resources/
    └── tours.txt              # Archivo de datos con los tours (formato: nombre;tipo;precio)
```

---

## Instrucciones para ejecutar

### En IntelliJ IDEA

1. Abre IntelliJ IDEA y selecciona **File > Open** → selecciona la carpeta `LlanquihueTourApp`.
2. Asegúrate de que la carpeta `src/` esté marcada como **Sources Root** (clic derecho → Mark Directory as → Sources Root).
3. Abre el archivo `src/ui/Main.java`.
4. Haz clic en el botón ▶ (Run) junto al método `main`.

> **Nota:** El programa busca el archivo `resources/tours.txt` desde el directorio raíz del proyecto. Asegúrate de ejecutar desde la raíz o de configurar el Working Directory en la configuración de ejecución de IntelliJ.

### Desde la terminal (compilación manual)

```bash
# Desde la raíz del proyecto
javac -d out src/model/Tour.java src/data/GestorDatos.java src/ui/Main.java
java -cp out ui.Main
```

---

## Autor

**Satcha** — DUOC UC, PRY2202
