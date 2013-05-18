from dictionary_arabic import DictionaryArabic

class PhoneStatement:
	phoneNumber = ''
	dictionary = {}

	def __init__(self, text):
		self.dictionary = DictionaryArabic()
		for letter in text:
			self.phoneNumber += self.dictionary.convertChar(letter)

	@staticmethod
	def factory(text):
		instance = PhoneStatement(text)
		return instance


	def __str__(self):
		return self.phoneNumber