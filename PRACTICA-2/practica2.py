import math
import matplotlib.pyplot as plt
import numpy as np

class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return "({},{})".format(self.x, self.y)

    def coord_polares(self):
        r = math.sqrt(self.x**2 + self.y**2)
        theta = math.atan2(self.y, self.x)  
        theta = math.degrees(theta)
        return r, theta

    def __str__(self):
        return "({:.2f},{:.2f})".format(self.x, self.y)

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def dibujaLinea(self):
        
        x_values = [self.p1.x, self.p2.x]
        y_values = [self.p1.y, self.p2.y]
        plt.plot(x_values, y_values, marker='o')
        plt.title("Dibujo de la línea")
        plt.xlabel("x")
        plt.ylabel("y")

        plt.show()

    def __str__(self):
        return f"Línea desde {self.p1} hasta {self.p2}"

class Circulo:
    def __init__(self, centro, radio: float):
        self.centro = centro  
        self.radio = radio

    def dibujaCirculo(self):
        
        theta = np.linspace(0, 2 * np.pi, 100)
        # Coordenadas del círculo
        x = self.centro.x + self.radio * np.cos(theta)
        y = self.centro.y + self.radio * np.sin(theta)
        plt.plot(x, y)
        plt.title("Dibujo del círculo")
        plt.xlabel("x")
        plt.ylabel("y")
        plt.axis("equal")
        plt.show()

    def __str__(self):
        return "El círculo tiene un centro {} y un radio de {:.2f}".format(self.centro, self.radio)



p1 = Punto(2, 5)
p2 = Punto(1, 6)
print(p1.coord_cartesianas())
print(p1.coord_polares())

linea = Linea(p1, p2)
print(linea)
linea.dibujaLinea()


circulo = Circulo(p1, 5)
print(circulo)
circulo.dibujaCirculo()
