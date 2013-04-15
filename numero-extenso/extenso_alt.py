class Numero:
	
	algarismos = {1:"um", 2:"dois", 3:"tres", 4:"quatro", 5:"cinco", 6:"seis", 7:"sete", 8:"oito", 9:"nove", 
								10:"dez", 11:"onze", 12:"doze", 13:"treze", 14:"quatorze", 15:"quinze", 16:"dezesseis", 17:"dezesete", 18:"dezoito", 19:"dezenove",
								20:"vinte", 30:"trinta", 40:"quarenta", 50:"cinquenta", 60:"sessenta", 70:"setenta", 80:"oitenta", 90:"noventa",
								100:"cento", 200:"duzentos", 300:"trezentos"}
	
	
	def __init__(self, numero):
		self.numero = numero
		self.algarismos_keys_reverse = self.algarismos.keys()
		self.algarismos_keys_reverse.sort()
		self.algarismos_keys_reverse.reverse()
	
	def to_s(self):
		return " ".join([self.__extenso(), self.__moeda()])
	
	def __extenso(self):
		if self.numero == 100:
			return "cem"
		return self.__extensoPara(self.numero)

	def __extensoPara(self, valor):
		if not self.__temNumero(valor):
			maiorAlgarismo = self.__maiorAlgarismoPara(valor)
			return self.__extensoPara(maiorAlgarismo) + " e " + self.__extensoPara(valor - maiorAlgarismo)
		return self.algarismos[valor]

	def __maiorAlgarismoPara(self, valor):
		for key in self.algarismos_keys_reverse:
			if key <= valor:
				return key;
		
	def __moeda(self):
		if self.numero == 1:
			return "real"
		return "reais"
		
	def __temNumero(self, valor):
		try:
			self.algarismos[valor]	
			return True
		except:
			return False
