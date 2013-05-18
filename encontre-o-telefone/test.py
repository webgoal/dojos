import unittest

from phone_statement import PhoneStatement

class PhoneStatementTest(unittest.TestCase):
	def test1_1(self):
		statement = PhoneStatement.factory('1')
		self.assertEquals(str(statement), '1')

	def test0_0(self):
		statement = PhoneStatement.factory('0')
		self.assertEquals(str(statement), '0')	

	def testhiffen_hiffen(self):
		statement = PhoneStatement.factory('-')
		self.assertEquals(str(statement), '-')

	def testA_2(self):
		statement = PhoneStatement.factory('A')
		self.assertEquals(str(statement), '2')			

	def testB_2(self):
		statement = PhoneStatement.factory('B')
		self.assertEquals(str(statement), '2')

	def testC_2(self):
		statement = PhoneStatement.factory('C')
		self.assertEquals(str(statement), '2')

	def testD_3(self):
		statement = PhoneStatement.factory('D')
		self.assertEquals(str(statement), '3')

	def testS_7(self):
		statement = PhoneStatement.factory('S')
		self.assertEquals(str(statement), '7')

	def testWG_94(self):
		statement = PhoneStatement.factory('WG')
		self.assertEquals(str(statement), '94')

	def testPhrase_Number(self):
		statement = PhoneStatement.factory('1-HOME-SWEET-HOME')
		self.assertEquals(str(statement), '1-4663-79338-4663')

unittest.main()