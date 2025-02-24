import math

class Punto:

    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return (self.x, self.y)
    
    def coord_polares(self):
        r = math.sqrt(self.x**2 + self.y**2)
        angulo = math.atan2(self.y, self.x)  # Cambié math.atan() por math.atan2()
        angulo = math.degrees(angulo)
        return (r, angulo)
    def __str__(self):
        return "({:.2f},{:.2f})".format(self.x, self.y)

p1 = Punto(0,3)
print(p1)
x,y = p1.coord_cartesianas()
print(x,y)
r,a = p1.coord_polares()
print(r,a)