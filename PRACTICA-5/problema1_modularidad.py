import math
def getDiscriminante(a, b, c):
    discriminante = b**2 - 4 * a * c
    if discriminante > 0:
        return "la ecuacion tiene dos soluciones: {:.5f} y {:.5f}".format(getRaiz1( a,b,c), getRaiz2(a,b,c))
    elif discriminante == 0:
        return "la ecuacion solo tiene una solucion: {:.0f} ".format(getRaiz1(a,b, c))
    else:
        return "no hay soluciones reales para esta ecuacion"

def getRaiz1( a, b, c):
    return ((-b + math.sqrt(b**2 - 4 * a * c)) / (2 * a))
def getRaiz2(a, b, c):
    return ((-b - math.sqrt(b**2 - 4 * a * c)) / (2 * a))

a,b,c = map(float, input("ingrese a,b,c").split())
print(getDiscriminante(a,b,c))


