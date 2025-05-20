class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Año: {self.año}")
        print(f"Precio base: ${self.precio_base}")

    @staticmethod
    def mostrar_todos(coches, motos):
        print("== Información de los coches ==")
        for coche in coches:
            coche.mostrar_info()
        print("== Información de las motos ==")
        for moto in motos:
            moto.mostrar_info()

    @staticmethod
    def mostrar_coches_mas_de_4_puertas(coches):
        print("== Coches con más de 4 puertas ==")
        for coche in coches:
            if coche.num_puertas > 4:
                coche.mostrar_info()

    @staticmethod
    def mostrar_vehiculos_2025(coches, motos):
        print("== Vehículos del año 2025 ==")
        for coche in coches:
            if coche.año == 2025:
                coche.mostrar_info()
        for moto in motos:
            if moto.año == 2025:
                moto.mostrar_info()


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de puertas: {self.num_puertas}")
        print(f"Tipo de combustible: {self.tipo_combustible}")
        print("---------------------------")


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}cc")
        print(f"Tipo de motor: {self.tipo_motor}")
        print("---------------------------")

if __name__ == "__main__":
    coches = [
        Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina"),
        Coche("Ford", "Explorer", 2025, 30000, 5, "Diésel"),
        Coche("Honda", "Civic", 2024, 22000, 4, "Híbrido")
    ]

    motos = [
        Moto("Yamaha", "R3", 2025, 15000, 321, "4 tiempos"),
        Moto("Kawasaki", "Ninja 400", 2023, 17000, 399, "4 tiempos")
    ]

    Vehiculo.mostrar_todos(coches, motos)
    Vehiculo.mostrar_coches_mas_de_4_puertas(coches)
    Vehiculo.mostrar_vehiculos_2025(coches, motos)
