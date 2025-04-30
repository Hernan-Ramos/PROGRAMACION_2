class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z

    def incrementaXZ(self):
        self.x += 1
        self.z += 1

    def incrementaZ(self):
        self.z += 1


class B:
    def __init__(self, y, z):
        self.y = y
        self.z_b = z  

    def incrementaYZ(self):
        self.y += 1
        self.z_b += 1

    def incrementaZ(self):
        self.z_b += 2


class D(A, B):
    def __init__(self, x, y, z):
        A.__init__(self, x, z)
        B.__init__(self, y, z)

    def incrementaXYZ(self):
        self.x += 1
        self.y += 1
        self.z += 1
        self.z_b += 1


obj = D(1, 2, 3)
obj.incrementaXYZ()
print("x:", obj.x)
print("y:", obj.y)
print("z de A:", obj.z)
print("z de B:", obj.z_b)
