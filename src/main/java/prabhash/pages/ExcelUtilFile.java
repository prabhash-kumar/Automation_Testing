package prabhash.pages;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelUtilFile {

	private static final String[] COLUMNS = { "Product Name", "MRP", "Discount Price" };

	public static void writeToExcelSheet(List<String[]> productDetails, String fileName) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Product Details");

		Row headerRow = sheet.createRow(0);

		for (int i = 0; i < COLUMNS.length; i++) {
			headerRow.createCell(i).setCellValue(COLUMNS[i]);
		}

		int rowNum = 1;
		for (String[] productDetail : productDetails) {
			Row row = sheet.createRow(rowNum++);

			row.createCell(0).setCellValue(productDetail[0]);
			row.createCell(1).setCellValue(productDetail[1]);
			row.createCell(2).setCellValue(productDetail[2]);
		}

		for (int i = 0; i < COLUMNS.length; i++) {
			sheet.autoSizeColumn(i);
		}

		FileOutputStream fileOut = new FileOutputStream(fileName);
		workbook.write(fileOut);
		workbook.close();
	}
}
