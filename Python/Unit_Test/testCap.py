import unittest

import cap

class TestCap(unittest.TestCase):

    def test_one_singleWord(self):
        text = 'python'
        result = cap.capi_func(text)
        self.assertEqual(result,'Python')

    def test_two_multipleWord(self):
        text = 'python monty'
        result = cap.capi_func(text)
        self.assertEqual(result,'Python Monty')

if __name__!='__main':
    unittest.main()
