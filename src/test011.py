from selenium import webdriver
from selenium.webdriver.common.by import By
import unittest

class Test026(unittest.TestCase):

    def test_case_01(self):
        self.driver = webdriver.Chrome("D:\\webdriver\\chromedriver.exe")
        self.driver.get("http://127.0.0.1/011/testcase.html")
        
        first = self.driver.find_element(By.ID,"firstName")
        lastname = self.driver.find_element(By.ID,"lastName")
        age = self.driver.find_element(By.ID,"age")
        submit = self.driver.find_element(By.ID,"submit")
        
        first.send_keys("johnjohn")
        lastname.send_keys("cononccononc")
        age.send_keys("149")
        submit.click()
        
        result = self.driver.find_element(By.ID,"firstName").text
        self.assertEqual("First Name:johnjohn", result)

         # บันทึกภาพหน้าจอ
        self.driver.save_screenshot("john01.png")

        self.driver.close()

    # เพิ่มเทสเคสอื่นๆ ตามลำดับเช่น test_case_03, test_case_04, และอื่นๆ

if __name__ == "__main__":
    unittest.main()
