class Numero:
	
	algarismos = {1:"um", 2:"dois", 3:"tres", 4:"quatro", 5:"cinco", 6:"seis", 7:"sete", 8:"oito", 9:"nove", 
								10:"dez", 11:"onze", 12:"doze", 13:"treze", 14:"quatorze", 15:"quinze", 16:"dezesseis", 17:"dezesete", 18:"dezoito", 19:"dezenove",
								20:"vinte", 30:"trinta", 40:"quarenta", 50:"cinquenta", 60:"sessenta", 70:"setenta", 80:"oitenta", 90:"noventa",
								100:"cento", 200:"duzentos"}
	
	
	def __init__(self, numero):
		self.numero = numero
	
	def to_s(self):
		return " ".join([self.__numeroExtenso(), self.__moeda()])
		
	def __numeroExtenso(self):
		if self.numero == 100:
			return "cem"
		
		if not self.__TemNumero():
			if self.numero > 100:
				return self.algarismos[self.__centena()] + " e " + Numero(self.numero - self.__centena()).__numeroExtenso()
			return self.algarismos[self.__dezena()] + " e " + self.algarismos[self.__unidade()]
		return self.algarismos[self.numero]
		
	def __moeda(self):
		if self.numero == 1:
			return "real"
		return "reais"
		
	def __TemNumero(self):
		try:
			self.algarismos[self.numero]	
			return True
		except:
			return False
	
	def __dezena(self):
		return (self.numero/10)*10
		
	def __unidade(self):
		return self.numero%10
		
	def __centena(self):
		return (self.numero/100)*100