package com.utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.apache.poi.xssf.usermodel.*
import org.apache.poi.ss.usermodel.*
import java.io.*


public class Write_Status {
	@Keyword
	def static void writeToCell(String filePath, String sheetName, int rowIndex, int colIndex, String value) {
		FileInputStream fis = new FileInputStream(new File(filePath))
		XSSFWorkbook workbook = new XSSFWorkbook(fis)
		XSSFSheet sheet = workbook.getSheet(sheetName)
		
		XSSFRow row = sheet.getRow(rowIndex)
		if (row == null) {
			row = sheet.createRow(rowIndex)
		}

		XSSFCell cell = row.getCell(colIndex)
		if (cell == null) {
			cell = row.createCell(colIndex)
		}

		cell.setCellValue(value)

		fis.close()

		FileOutputStream fos = new FileOutputStream(new File(filePath))
		workbook.write(fos)
		fos.close()
		workbook.close()
	}
}
