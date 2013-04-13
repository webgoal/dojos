import unittest

from extenso import Numero

class NumeroExtensoTest(unittest.TestCase):
	
	def testeModuloNumero(self):
		self.assertEquals(40, (42/10)*10)
		self.assertEquals(2, 42 % 10)
	
	def testeUmReal(self):
		numero = Numero(1)
		self.assertEquals("um real", numero.to_s())
		
	def testeDoisReais(self):
		numero = Numero(2)
		self.assertEquals("dois reais", numero.to_s())
	
	def testeCincoReais(self):
		numero = Numero(5)
		self.assertEquals("cinco reais", numero.to_s())
		
	def testeNoveReais(self):
		numero = Numero(9)
		self.assertEquals("nove reais", numero.to_s())		
	
	def testeDezReais(self):
		numero = Numero(10)
		self.assertEquals("dez reais", numero.to_s())		
	
	def testeQuatorzeReais(self):
		numero = Numero(14)
		self.assertEquals("quatorze reais", numero.to_s())		
	
	def testeVinteReais(self):
		numero = Numero(20)
		self.assertEquals("vinte reais", numero.to_s())
	
	def testeTrintaReais(self):
		numero = Numero(30)
		self.assertEquals("trinta reais", numero.to_s())
		
	def testeNoventaReais(self):
		numero = Numero(90)
		self.assertEquals("noventa reais", numero.to_s())
		
	def testeVinteEQuatroReais(self):
		numero = Numero(24)
		self.assertEquals("vinte e quatro reais", numero.to_s())
	
	def testeQuarentaEDoisReais(self):
		numero = Numero(42)
		self.assertEquals("quarenta e dois reais", numero.to_s())

	def testeCemReais(self):
		numero = Numero(100)
		self.assertEquals("cem reais", numero.to_s())
		
	def testeDuzentosReais(self):
		numero = Numero(200)
		self.assertEquals("duzentos reais", numero.to_s())
		
	def testeCentoEUmReais(self):
		numero = Numero(101)
		self.assertEquals("cento e um reais", numero.to_s())	
	
	def testeCentoETrintaReais(self):
		numero = Numero(130)
		self.assertEquals("cento e trinta reais", numero.to_s())
		
unittest.main()