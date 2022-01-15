package dev.pratul;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class TransformDates {

	/**
	 * Transforms dates in a file from one format to another.
	 * <p>
	 * For example, assume a file whose contents are "On 9/6/78, a really cool thing
	 * happened. 9/11/01 was a really bad day. Nothing much happened on 9/10,
	 * though." Also assume a source format of "M/d/yy" and a destination format of
	 * "EEEE, MMMM dd, yyyy". The expected output would be "On Wednesday, September
	 * 06, 1978, a really cool thing happened. Tuesday, September 11, 2001 was a
	 * really bad day. Nothing much happened on 9/10, though."
	 * 
	 * @param file               The file whose dates will be transformed.
	 * @param sourcePattern      A {@link SimpleDateFormat}-compatible date format
	 *                           that identifies the format of dates within the file
	 *                           to transform.
	 * @param destinationPattern A {@link SimpleDateFormat}-compatible date format
	 *                           that identifies the destination format of
	 *                           transformed dates.
	 */
	public static void transformDates(final File file, String sourcePattern, String destinationPattern) {
		List<String> lines = readFileAndConvertToList(file.getAbsolutePath());
		lines.forEach(System.out::println);
		if (!lines.isEmpty()) {
			for (int i = 0; i < lines.size(); i++) {
				String[] words = lines.get(i).split(" ");
				for (int j = 0; j < words.length; j++) {
					Date date = stringToDate(words[j], sourcePattern);
					if (date != null) {
						String desiredDate = dateToString(date, destinationPattern);

						/*
						 * cover boundary cases where special characters are present at the end of date
						 * string which gets ignored by SimpleDateFormat class.
						 * 
						 * ex: 9/6/78,!?*$#%$%#345654456*^&%^&
						 */
						String initialDateWithoutSpecialChars = dateToString(date, sourcePattern);
						if (words[j].equalsIgnoreCase(initialDateWithoutSpecialChars)) {
							words[j] = desiredDate;
						} else {
							String specialChars = words[j].substring(initialDateWithoutSpecialChars.length());
							words[j] = desiredDate + specialChars;
						}
					}
				}
				lines.set(i, String.join(" ", words));
			}
		}
		lines.forEach(System.out::println);
	}

	public static Date stringToDate(String word, String sourcePattern) {
		SimpleDateFormat sourceFormat = new SimpleDateFormat(sourcePattern);
		try {
			Date date = sourceFormat.parse(word);
			return date;
		} catch (ParseException e) {
			return null;
		}
	}

	public static String dateToString(Date date, String pattern) {
		SimpleDateFormat sourceFormat = new SimpleDateFormat(pattern);
		return sourceFormat.format(date);
	}

	/**
	 * @param file - file location
	 * @return - list of String where each element represents a line in the file
	 * 
	 *         since it's an ArrayList, the insertion order of elements will be
	 *         maintained
	 */
	public static List<String> readFileAndConvertToList(String file) {
		List<String> lines = new ArrayList<>();
		try (BufferedReader br = Files.newBufferedReader(Paths.get(file))) {
			lines = br.lines().collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

	public static void main(String[] args) {
		String filePath = "/Users/pratulpatwari/Desktop/FIS/test.txt";
		String sourcePattern = "M/d/yy";
		String destinationPattern = "EEEE, MMMM dd, yyyy";

		File file = new File(filePath);

		if (file.exists() && file.isFile()) {
			transformDates(file, sourcePattern, destinationPattern);
		} else {
			System.out.println(
					"The file location or filename is invalid. Please provide the valid file location and name");
		}

	}

}
