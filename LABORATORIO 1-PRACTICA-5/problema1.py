import math

class Ecuaciones_Cuadraticas:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def getDiscriminante(self):
        if self.a == 0:
            return "la ecuacion no tiene solucion"
        else:
            discriminante = self.b**2 - 4 * self.a * self.c  

            if discriminante > 0:
                return "La ecuación tiene dos raíces {:.5f} y {:.5f}".format(self.getraiz1(), self.getraiz2())
            elif discriminante == 0:
                return "La ecuación tiene una raíz {:.0f}".format(self.getraiz1())
            else:
                return "La ecuación no tiene raíces reales"

    def getraiz1(self):
        return (-self.b + math.sqrt(self.b**2 - 4 * self.a * self.c)) / (2 * self.a)

    def getraiz2(self):
        return (-self.b - math.sqrt(self.b**2 - 4 * self.a * self.c)) / (2 * self.a)

a, b, c = map(float, input("Ingrese a, b, c: ").split())
ecuacion1 = Ecuaciones_Cuadraticas(a, b, c)
resultado = ecuacion1.getDiscriminante()
print(resultado)
