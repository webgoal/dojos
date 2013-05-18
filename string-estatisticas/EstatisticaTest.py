import unittest

from Estatistica import EstatisticaFabrique

class testSeqVazio(unittest.TestCase):
	
	seq = []

	def testTamanhoSequencia(self):
		self.assertEquals(0, EstatisticaFabrique.noveau(self.seq).tamanho())

	def testValorMinimo(self):
		self.assertEquals(None, EstatisticaFabrique.noveau(self.seq).minimo())

	def testValorMaximo(self):
		self.assertEquals(None, EstatisticaFabrique.noveau(self.seq).maximo())

	def testMediaDeValores(self):
		self.assertEquals(None, EstatisticaFabrique.noveau(self.seq).media())	
	

class testSeqCom5(unittest.TestCase):
	
	seq = [5, 2, 7, -4, 9]

	def testTamanhoSequencia(self):
		self.assertEquals(5, EstatisticaFabrique.noveau(self.seq).tamanho())

	def testValorMinimo(self):
		self.assertEquals(-4, EstatisticaFabrique.noveau(self.seq).minimo())

	def testValorMaximo(self):
		self.assertEquals(9, EstatisticaFabrique.noveau(self.seq).maximo())

	def testMediaDeValores(self):
		self.assertEquals(3.8, EstatisticaFabrique.noveau(self.seq).media())		
	

unittest.main()

