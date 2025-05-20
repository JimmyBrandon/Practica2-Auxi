from datetime import date

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac
        self.sexo = sexo

    def edad(self):
        hoy = date.today()
        return hoy.year - self.fecha_nac.year - ((hoy.month, hoy.day) < (self.fecha_nac.month, self.fecha_nac.day))

    def mostrar_info(self):
        print(f"{self.nombre} {self.apellido} ({self.edad()} años)")


class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, ru, fecha_ingreso, semestre, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar_info(self):
        super().mostrar_info()
        print(f"RU: {self.ru} | Semestre: {self.semestre}")

    @staticmethod
    def mostrar_mayores_25(estudiantes):
        for e in estudiantes:
            if e.edad() > 25:
                e.mostrar_info()

    @staticmethod
    def mostrar_mismo_apellido(estudiantes, docentes):
        for e in estudiantes:
            for d in docentes:
                if e.apellido.lower() == d.apellido.lower():
                    e.mostrar_info()
                    d.mostrar_info()


class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Profesión: {self.profesion} | Especialidad: {self.especialidad}")

    @staticmethod
    def mostrar_ingeniero_mayor(docentes):
        candidatos = [d for d in docentes if d.profesion.lower() == "ingeniero" and d.sexo.lower() == "masculino"]
        if candidatos:
            mayor = max(candidatos, key=lambda d: d.edad())
            mayor.mostrar_info()

from datetime import date
estudiantes = [
    Estudiante("123", "Luis", "Gomez", "77711111", date(1997, 1, 10), "RU123", date(2020, 2, 1), 8, "Masculino"),
    Estudiante("456", "Ana", "Perez", "77722222", date(2007, 5, 5), "RU456", date(2023, 3, 1), 2, "Femenino")
]

docentes = [
    Docente("789", "Carlos", "Gomez", "77733333", date(1970, 3, 20), "NIT789", "Ingeniero", "Sistemas", "Masculino"),
    Docente("012", "Maria", "Lopez", "77744444", date(1985, 7, 15), "NIT012", "Licenciada", "Matemática", "Femenino")
]

Estudiante.mostrar_mayores_25(estudiantes)
Docente.mostrar_ingeniero_mayor(docentes)
Estudiante.mostrar_mismo_apellido(estudiantes, docentes)
