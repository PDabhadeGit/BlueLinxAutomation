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



import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream



import internal.GlobalVariable

public class ExcelWriter {


	@Keyword
	def writeOrderIdToExcel(String filePath, String orderId) {
		File file = new File(filePath)

		if (!file.exists()) {
			throw new FileNotFoundException("Excel file does not exist at: ${filePath}")
		}

		FileInputStream fis = new FileInputStream(file)
		Workbook workbook = new XSSFWorkbook(fis)
		Sheet sheet = workbook.getSheetAt(0) // Use first sheet

		int lastRow = sheet.getLastRowNum()
		Row row = sheet.createRow(lastRow + 1)

		row.createCell(0).setCellValue(orderId)
		sheet.autoSizeColumn(0)

		fis.close()

		FileOutputStream fos = new FileOutputStream(file)
		workbook.write(fos)
		fos.close()
		workbook.close()

		println("Order ID '${orderId}' written to Excel file at: ${filePath}")
	}
}
