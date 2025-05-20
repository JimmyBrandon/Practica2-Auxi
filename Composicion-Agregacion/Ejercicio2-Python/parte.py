class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        print(f"Parte: {self.nombre}, Peso: {self.peso} kg")