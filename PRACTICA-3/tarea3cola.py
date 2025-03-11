class Cola :
    def __init__(self,n:int):
        self.__arreglo = [0] * n
        self.__inicio = 0
        self.__fin = 0
        self.__n = n

    def insert(self, e):
        if self.isFull():
            print("Cola llena")
        else:
            self.__arreglo[self.__fin] = e
            self.__fin += 1
    
    def remove(self):
        if self.isEmpty():
            print("La cola esta vacia no se puede remover nada")
        else:
            valor = self.__arreglo[self.__inicio]
            self.__inicio += 1
            if self.__inicio == self.__fin:
                self.__inicio = 0
                self.__fin = 0
            return valor
    def peek(self):
        if self.isEmpty():
            print("La cola esta vacia no hay un peek")
        else :
            return self.__arreglo[self.__inicio]
        
    def isEmpty(self):
        if self.__inicio == self.__fin:
            return True
        return False

    def isFull(self):
        if self.__fin == self.__n  :
            return True
        return False

    def size(self):
        return self.__fin - self.__inicio
cola = Cola(5)

cola.insert(10)
cola.insert(20)
cola.insert(30)

print("Primer elemento:", cola.peek())

print("Elemento removido:", cola.remove())

print("¿Está vacía la cola?", cola.isEmpty())

print("Tamaño de la cola:", cola.size())

cola.insert(40)
cola.insert(50)
cola.insert(60)

print("Tamaño final:", cola.size())



        

