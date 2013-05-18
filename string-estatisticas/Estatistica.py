class EstatisticaFabrique:
	
	@staticmethod
	def noveau(sequencia):
		return Estatistica(sequencia) if len(sequencia) > 0 else EstatisticaSeqVazia()

class Estatistica:

	def __init__(self, sequencia):
		self.sequencia = sequencia

	def tamanho(self):
		return len(self.sequencia)

	def minimo(self):
		return min(self.sequencia)

	def maximo(self):
		return max(self.sequencia)

	def media(self):
		return float(self.soma())/self.tamanho()

	def soma(self):
		return sum(self.sequencia)


class EstatisticaSeqVazia:
	def tamanho(self):
		return 0

	def minimo(self):
		return None

	def maximo(self):
		return None

	def media(self):
		return None

