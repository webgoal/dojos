class DictionaryArabic:
	dictionary = {
			'2':['A','B','C'],
			'3':['D','E','F'],
			'4':['G','H','I'],
			'5':['J','K','L'],
			'6':['M','N','O'],
			'7':['P','Q','R','S'],
			'8':['T','U','V'],
			'9':['W','X','Y','Z']
		}

	def convertChar(self,text):
		for key in self.dictionary:
			if text in self.dictionary[key]: return key

		return text