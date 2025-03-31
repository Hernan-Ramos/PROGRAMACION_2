#Diego Hernan Ramos Choque
#31 de marzo
class AlgebraVectorial:
    def __init__(self, a1, a2, a3):
        self.a1 = a1
        self.a2 = a2
        self.a3 = a3

    def __str__(self):
        return f"({self.a1}, {self.a2}, {self.a3})"
    
    def __add__(self, otro_vector):
        return AlgebraVectorial(self.a1 + otro_vector.a1, self.a2 + otro_vector.a2, self.a3 + otro_vector.a3)

    def longitud(self):
        return (self.a1**2 + self.a2**2 + self.a3**2)**0.5
    
    def normal(self):
        l = self.longitud()
        return AlgebraVectorial(self.a1/l, self.a2/l, self.a3/l)

    def producto_escalar(self, otro_vector):
        return self.a1 * otro_vector.a1 + self.a2 * otro_vector.a2 + self.a3 * otro_vector.a3

    def producto_vectorial(self, otro_vector):
        return AlgebraVectorial(
            self.a2 * otro_vector.a3 - self.a3 * otro_vector.a2,
            self.a3 * otro_vector.a1 - self.a1 * otro_vector.a3,
            self.a1 * otro_vector.a2 - self.a2 * otro_vector.a1
        )
    def multiplicar_por_escalar(self, escalar):
        return AlgebraVectorial(self.a1 * escalar, self.a2 * escalar, self.a3 * escalar)

v1 = AlgebraVectorial(1, 2, 3)
v2 = AlgebraVectorial(4, 5, 6)
v3 = v1 + v2
v4 = v1.producto_vectorial(v2)
escalar = 4
resultado = v1.multiplicar_por_escalar(escalar)
print("Suma:", v3)  
print("Multiplicación vectorial:", v4) 
print(f"Multiplicación por escalar ({escalar} * {v1}): {resultado}")  
