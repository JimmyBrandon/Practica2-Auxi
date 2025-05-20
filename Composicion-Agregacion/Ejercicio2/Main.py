from avion import Avion
from parte import Parte

avion = Avion("Boeing 747", "Boeing")

avion.agregar_parte(Parte("Motor", 5000))
avion.agregar_parte(Parte("Alas", 3000))
avion.agregar_parte(Parte("Tren de aterrizaje", 1500))

avion.mostrar_avion()

