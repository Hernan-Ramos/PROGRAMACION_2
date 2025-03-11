import math
class Circulo :
    def area(self, radio):
        return math.pi * radio * radio

class Rectangulo :
    def area(self, base, altura):
        return base * altura

class Triangulo :
    def area(self, base, altura):
        return (base * altura)/ 2

class Trapecio:
    def area(self, base1, base2, altura):
        return ((base1 + base2)* altura)/2
class Pentagono:
    def area(self,lado,apotema):
        return (5 * lado * apotema)/2
circulo = Circulo()
rectangulo = Rectangulo()
triangulo = Triangulo()
trapecio = Trapecio()
pentagono = Pentagono()

print(circulo.area(3))
print(rectangulo.area(5,6))
print(triangulo.area(5,3))
print(trapecio.area(4,5,4))
print(pentagono.area(20,5))


