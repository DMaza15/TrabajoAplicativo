Actúa como un Desarrollador Senior de Android experto en Kotlin, Jetpack Compose y Material Design 3.

Necesito maquetar e implementar una aplicación móvil con diseño visual de estilo "Portal Académico Universitario" utilizando una paleta de tonos violetas y morados (Morado Oscuro #4A3780, Morado Medio #6750A4, Violeta Claro #EADBFF, Fondo Lavanda #ECE6F0 y Fondo General #F8F5FA).

REQUISITOS TÉCNICOS Y ARQUITECTURA:
1. Crea los componentes visuales de manera INDEPENDIENTE y REUTILIZABLE dentro del paquete `components`:
   - `AcademicTopBar`: TopAppBar oficial de Material 3 personalizable con título en negrita, botón de retorno y colores configurables.
   - `StudentCardItem`: Tarjeta con bordes redondeados (16.dp), fondo lavanda claro (#ECE6F0), foto circular a la izquierda con painterResource(id = R.drawable.profile_placeholder), nombre en negrita, carrera en gris e ícono de flecha derecha.
   - `AcademicInfoRow`: Fila para mostrar atributos con ícono dentro de un contenedor pequeño violeta claro (10.dp), etiqueta y valor.
   - `ProfileHeaderBanner`: Banner superior morado oscuro (#4A3780) con esquinas inferiores curvas (24.dp), foto de perfil circular centrada con borde y nombre en texto blanco.
   - `ProfileInfoItem`: Fila con ícono en un recuadro pequeño con esquinas redondeadas (8.dp) a la izquierda, etiqueta del campo y valor.
   - `SectionHeader`: Subtítulo de sección formateado en letras MAYÚSCULAS, negrita, morado oscuro y espaciado de letras.

2. Implementa las 3 pantallas en la carpeta `screens` haciendo uso de los componentes independientes:
   - PANTALLA 1: "Directorio de Alumnos" (ListScreen.kt) con TopAppBar violeta claro y LazyColumn de StudentCardItem.
   - PANTALLA 2: "Expediente Académico" (DetailScreen.kt) con TopAppBar limpia blanca, contenedor superior curvo (32.dp) morado oscuro con foto circular grande, nombre centrado, carrera y Card amplia (20.dp) con AcademicInfoRow y Biografía.
   - PANTALLA 3: "Configuración de Perfil" (ProfileScreen.kt) con ProfileHeaderBanner, secciones en mayúsculas ("INFORMACIÓN PERSONAL" y "ACADÉMICO") y filas ProfileInfoItem.

3. Mantén `MainActivity.kt` totalmente limpio llamando únicamente al AppNavigation con el tema de la app.
4. Incluye comentarios explicativos en español en cada archivo indicando la función de cada componente y parámetro.
