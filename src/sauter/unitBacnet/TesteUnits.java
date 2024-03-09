package sauter.unitBacnet;

import java.util.Arrays;
import java.util.List;

public class TesteUnits {
	
	  public static final String SQUARE_METERS = "0x0000";
	  public static final String SQUARE_FEET = "0x0001";
	  public static final String MILLIAMPERES = "0x0002";
	  public static final String AMPERES = "0x0003";
	  public static final String OHMS = "0x0004";
	  public static final String VOLTS = "0x0005";
	  public static final String KILOVOLTS = "0x0006";
	  public static final String MEGAVOLTS = "0x0007";
	  public static final String VOLT_AMPERES = "0x0008";
	  public static final String KILOVOLT_AMPERES = "0x0009";
	  public static final String MEGAVOLT_AMPERES = "0x000A";
	  public static final String VOLT_AMPERES_REACTIVE = "0x000B";
	  public static final String KILOVOLT_AMPERES_REACTIVE = "0x000C";
	  public static final String MEGAVOLT_AMPERES_REACTIVE = "0x000D";
	  public static final String DEGREES_PHASE = "0x000E";
	  public static final String POWER_FACTOR = "0x000F";
	  public static final String JOULES = "0x0010";
	  public static final String KILOJOULES = "0x0011";
	  public static final String WATT_HOURS = "0x0012";
	  public static final String KILOWATT_HOURS = "0x0013";
	  public static final String BTUS = "0x0014";
	  public static final String THERMS = "0x0015";
	  public static final String TON_HOURS = "0x0016";
	  public static final String JOULES_PER_KILOGRAM_DRY_AIR = "0x0017";
	  public static final String BTUS_PER_POUND_DRY_AIR = "0x0018";
	  public static final String CYCLES_PER_HOUR = "0x0019";
	  public static final String CYCLES_PER_MINUTE = "0x001A";
	  public static final String HERTZ = "0x001B";
	  public static final String GRAMS_OF_WATER_PER_KILOGRAM_DRY_AIR = "0x001C";
	  public static final String PERCENT_RELATIVE_HUMIDITY = "0x001D";
	  public static final String MILLIMETERS = "0x001E";
	  public static final String METERS = "0x001F";
	  public static final String INCHES = "0x0020";
	  public static final String FEET = "0x0021";
	  public static final String WATTS_PER_SQUARE_FOOT = "0x0022";
	  public static final String WATTS_PER_SQUARE_METER = "0x0023";
	  public static final String LUMENS = "0x0024";
	  public static final String LUXES = "0x0025";
	  public static final String FOOT_CANDLES = "0x0026";
	  public static final String KILOGRAMS = "0x0027";
	  public static final String POUNDS_MASS = "0x0028";
	  public static final String TONS = "0x0029";
	  public static final String KILOGRAMS_PER_SECOND = "0x002A";
	  public static final String KILOGRAMS_PER_MINUTE = "0x002B";
	  public static final String KILOGRAMS_PER_HOUR = "0x002C";
	  public static final String POUNDS_MASS_PER_MINUTE = "0x002D";
	  public static final String POUNDS_MASS_PER_HOUR = "0x002E";
	  public static final String WATTS = "0x002F";
	  public static final String KILOWATTS = "0x0030";
	  public static final String MEGAWATTS = "0x0031";
	  public static final String BTUS_PER_HOUR = "0x0032";
	  public static final String HORSEPOWER = "0x0033";
	  public static final String TONS_REFRIGERATION = "0x0034";
	  public static final String PASCALS = "0x0035";
	  public static final String KILOPASCALS = "0x0036";
	  public static final String BARS = "0x0037";
	  public static final String POUNDS_FORCE_PER_SQUARE_INCH = "0x0038";
	  public static final String CENTIMETERS_OF_WATER = "0x0039";
	  public static final String INCHES_OF_WATER = "0x003A";
	  public static final String MILLIMETERS_OF_MERCURY = "0x003B";
	  public static final String CENTIMETERS_OF_MERCURY = "0x003C";
	  public static final String INCHES_OF_MERCURY = "0x003D";
	  public static final String DEGREES_CELSIUS = "0x003E";
	  public static final String DEGREES_KELVIN = "0x003F";
	  public static final String DEGREES_FAHRENHEIT = "0x0040";
	  public static final String DEGREE_DAYS_CELSIUS = "0x0041";
	  public static final String DEGREE_DAYS_FAHRENHEIT = "0x0042";
	  public static final String YEARS = "0x0043";
	  public static final String MONTHS = "0x0044";
	  public static final String WEEKS = "0x0045";
	  public static final String DAYS = "0x0046";
	  public static final String HOURS = "0x0047";
	  public static final String MINUTES = "0x0048";
	  public static final String SECONDS = "0x0049";
	  public static final String METERS_PER_SECOND = "0x004A";
	  public static final String KILOMETERS_PER_HOUR = "0x004B";
	  public static final String FEET_PER_SECOND = "0x004C";
	  public static final String FEET_PER_MINUTE = "0x004D";
	  public static final String MILES_PER_HOUR = "0x004E";
	  public static final String CUBIC_FEET = "0x004F";
	  public static final String CUBIC_METERS = "0x0050";
	  public static final String IMPERIAL_GALLONS = "0x0051";
	  public static final String LITERS = "0x0052";
	  public static final String US_GALLONS = "0x0053";
	  public static final String CUBIC_FEET_PER_MINUTE = "0x0054";
	  public static final String CUBIC_METERS_PER_SECOND = "0x0055";
	  public static final String IMPERIAL_GALLONS_PER_MINUTE = "0x0056";
	  public static final String LITERS_PER_SECOND = "0x0057";
	  public static final String LITERS_PER_MINUTE = "0x0058";
	  public static final String US_GALLONS_PER_MINUTE = "0x0059";
	  public static final String DEGREES_ANGULAR = "0x005A";
	  public static final String DEGREES_CELCIUS_PER_HOUR = "0x005B";
	  public static final String DEGREES_CELCIUS_PER_MINUTE = "0x005C";
	  public static final String DEGREES_FAHRENHEIT_PER_HOUR = "0x005D";
	  public static final String DEGREES_FAHRENHEIT_PER_MINUTE = "0x005E";
	  public static final String NO_UNITS = "0x005F";
	  public static final String PARTS_PER_MILLION = "0x0060";
	  public static final String PARTS_PER_BILLION = "0x0061";
	  public static final String PERCENT = "0x0062";
	  public static final String PERCENT_PER_SECOND = "0x0063";
	  public static final String PER_MINUTE = "0x0064";
	  public static final String PER_SECOND = "0x0065";
	  public static final String PSI_PER_DEGREE_FAHRENHEIT = "0x0066";
	  public static final String RADIANS = "0x0067";
	  public static final String REVOLUTIONS_PER_MINUTE = "0x0068";
	  public static final String CURRENCY1 = "0x0069";
	  public static final String CURRENCY2 = "0x006A";
	  public static final String CURRENCY3 = "0x006B";
	  public static final String CURRENCY4 = "0x006C";
	  public static final String CURRENCY5 = "0x006D";
	  public static final String CURRENCY6 = "0x006E";
	  public static final String CURRENCY7 = "0x006F";
	  public static final String CURRENCY8 = "0x0070";
	  public static final String CURRENCY9 = "0x0071";
	  public static final String CURRENCY10 = "0x0072";
	  public static final String SQUARE_INCHES = "0x0073";
	  public static final String SQUARE_CENTIMETERS = "0x0074";
	  public static final String BTUS_PER_POUND = "0x0075";
	  public static final String CENTIMETERS = "0x0076";
	  public static final String POUNDS_MASS_PER_SECOND = "0x0077";
	  public static final String DELTA_DEGREES_FAHRENHEIT = "0x0078";
	  public static final String DELTA_DEGREES_KELVIN = "0x0079";
	  public static final String KILOHMS = "0x007A";
	  public static final String MEGOHMS = "0x007B";
	  public static final String MILLIVOLTS = "0x007C";
	  public static final String KILOJOULES_PER_KILOGRAM = "0x007D";
	  public static final String MEGAJOULES = "0x007E";
	  public static final String JOULES_PER_DEGREE_KELVIN = "0x007F";
	  public static final String JOULES_PER_KILOGRAM_DEGREE_KELVIN = "0x0080";
	  public static final String KILOHERTZ = "0x0081";
	  public static final String MEGAHERTZ = "0x0082";
	  public static final String PER_HOUR = "0x0083";
	  public static final String MILLIWATTS = "0x0084";
	  public static final String HECTOPASCALS = "0x0085";
	  public static final String MILLIBARS = "0x0086";
	  public static final String CUBIC_METERS_PER_HOUR = "0x0087";
	  public static final String LITERS_PER_HOUR = "0x0088";
	  public static final String KILOWATT_HOURS_PER_SQUARE_METER = "0x0089";
	  public static final String KILOWATT_HOURS_PER_SQUARE_FOOT = "0x008A";
	  public static final String MEGAJOULES_PER_SQUARE_METER = "0x008B";
	  public static final String MEGAJOULES_PER_SQUARE_FOOT = "0x008C";
	  public static final String WATTS_PER_SQUARE_METERS_DEGREE_KELVIN = "0x008D";
	  public static final String CUBIC_FEET_PER_SECOND = "0x008E";
	  public static final String PERCENT_OBSCURATION_PER_FOOT = "0x008F";
	  public static final String PERCENT_OBSCURATION_PER_METER = "0x0090";
	  public static final String MILLIOHMS = "0x0091";
	  public static final String MEGAWATT_HOURS = "0x0092";
	  public static final String KILO_BTUS = "0x0093";
	  public static final String MEGA_BTUS = "0x0094";
	  public static final String KILOJOULES_PER_KILOGRAM_DRY_AIR = "0x0095";
	  public static final String MEGAJOULES_PER_KILOGRAM_DRY_AIR = "0x0096";
	  public static final String KILOJOULES_PER_DEGREE_KELVIN = "0x0097";
	  public static final String MEGAJOULES_PER_DEGREE_KELVIN = "0x0098";
	  public static final String NEWTON = "0x0099";
	  public static final String GRAMS_PER_SECOND = "0x009A";
	  public static final String GRAMS_PER_MINUTE = "0x009B";
	  public static final String TONS_PER_HOUR = "0x009C";
	  public static final String KILO_BTUS_PER_HOUR = "0x009D";
	  public static final String HUNDREDTHS_SECONDS = "0x009E";
	  public static final String MILLISECONDS = "0x009F";
	  public static final String NEWTON_METERS = "0x00A0";
	  public static final String MILLIMETERS_PER_SECOND = "0x00A1";
	  public static final String MILLIMETERS_PER_MINUTE = "0x00A2";
	  public static final String METERS_PER_MINUTE = "0x00A3";
	  public static final String METERS_PER_HOUR = "0x00A4";
	  public static final String CUBIC_METERS_PER_MINUTE = "0x00A5";
	  public static final String METERS_PER_SECOND_PER_SECOND = "0x00A6";
	  public static final String AMPERES_PER_METER = "0x00A7";
	  public static final String AMPERES_PER_SQUARE_METER = "0x00A8";
	  public static final String AMPERES_SQUARE_METERS = "0x00A9";
	  public static final String FARADS = "0x00AA";
	  public static final String HENRYS = "0x00AB";
	  public static final String OHM_METERS = "0x00AC";
	  public static final String SIEMENS = "0x00AD";
	  public static final String SIEMENS_PER_METER = "0x00AE";
	  public static final String TESLAS = "0x00AF";
	  public static final String VOLTS_PER_DEGREE_KELVIN = "0x00B0";
	  public static final String VOLTS_PER_METER = "0x00B1";
	  public static final String WEBERS = "0x00B2";
	  public static final String CANDELAS = "0x00B3";
	  public static final String CANDELAS_PER_SQUARE_METER = "0x00B4";
	  public static final String DEGREES_KELVIN_PER_HOUR = "0x00B5";
	  public static final String DEGREES_KELVIN_PER_MINUTE = "0x00B6";
	  public static final String JOULE_SECONDS = "0x00B7";
	  public static final String RADIANS_PER_SECOND = "0x00B8";
	  public static final String SQUARE_METERS_PER_NEWTON = "0x00B9";
	  public static final String KILOGRAMS_PER_CUBIC_METER = "0x00BA";
	  public static final String NEWTON_SECONDS = "0x00BB";
	  public static final String NEWTONS_PER_METER = "0x00BC";
	  public static final String WATTS_PER_METER_PER_DEGREE_KELVIN = "0x00BD";
	  public static final String MICRO_SIEMENS = "0x00BE";
	  public static final String CUBIC_FEET_PER_HOUR = "0x00BF";
	  public static final String US_GALLONS_PER_HOUR = "0x00C0";
	  public static final String KILOMETERS = "0x00C1";
	  public static final String MICROMETERS = "0x00C2";
	  public static final String GRAMS = "0x00C3";
	  public static final String MILLIGRAMS = "0x00C4";
	  public static final String MILLILITERS = "0x00C5";
	  public static final String MILLILITERS_PER_SECOND = "0x00C6";
	  public static final String DECIBELS = "0x00C7";
	  public static final String DECIBELS_MILLIVOLT = "0x00C8";
	  public static final String DECIBELS_VOLT = "0x00C9";
	  public static final String MILLISIEMENS = "0x00CA";
	  public static final String WATT_HOURS_REACTIVE = "0x00CB";
	  public static final String KILOWATT_HOURS_REACTIVE = "0x00CC";
	  public static final String MEGAWATT_HOURS_REACTIVE = "0x00CD";
	  public static final String MILLIMETERS_OF_WATER = "0x00CE";
	  public static final String PER_MILLE = "0x00CF";
	  public static final String GRAMS_PER_GRAM = "0x00D0";
	  public static final String KILOGRAMS_PER_KILOGRAM = "0x00D1";
	  public static final String GRAMS_PER_KILOGRAM = "0x00D2";
	  public static final String MILLIGRAMS_PER_GRAM = "0x00D3";
	  public static final String MILLIGRAMS_PER_KILOGRAM = "0x00D4";
	  public static final String GRAMS_PER_MILLILETER = "0x00D5";
	  public static final String GRAMS_PER_LITER = "0x00D6";
	  public static final String MILLIGRAMS_PER_LITER = "0x00D7";
	  public static final String MICROGRAMS_PER_LITER = "0x00D8";
	  public static final String GRAMS_PER_CUBIC_METER = "0x00D9";
	  public static final String MILLIGRAMS_PER_CUBIC_METER = "0x00DA";
	  public static final String MICROGRAMS_PER_CUBIC_METER = "0x00DB";
	  public static final String NANOGRAMS_PER_CUBIC_METER = "0x00DC";
	  public static final String GRAMS_PER_CUBIC_CENTIMETER = "0x00DD";
	  public static final String BECQUERELS = "0x00DE";
	  public static final String KILOBECQUERELS = "0x00DF";
	  public static final String MEGABECQUERELS = "0x00E0";
	  public static final String GRAY = "0x00E1";
	  public static final String MILLIGRAY = "0x00E2";
	  public static final String MICROGRAY = "0x00E3";
	  public static final String SIEVERTS = "0x00E4";
	  public static final String MILLISIEVERTS = "0x00E5";
	  public static final String MICROSIEVERTS = "0x00E6";
	  public static final String MICROSIEVERTS_PER_HOUR = "0x00E7";
	  public static final String DECIBELS_A = "0x00E8";
	  public static final String NEPHELOMETRIC_TURBIDITY_UNIT = "0x00E9";
	  public static final String PH = "0x00EA";
	  public static final String GRAMS_PER_SQUARE_METER = "0x00EB";
	  public static final String MINUTES_PER_DEGREE_KELVIN = "0x00EC";
	  
	  
	public static void main(String[] args) {
		
		String[] units = {
				"0x0000",
				"0x0001",
				"0x0002",
				"0x0003",
				"0x0004",
				"0x0005",
				"0x0006",
				"0x0007",
				"0x0008",
				"0x0009",
				"0x000A",
				"0x000B",
				"0x000C",
				"0x000D",
				"0x000E",
				"0x000F",
				"0x0010",
				"0x0011",
				"0x0012",
				"0x0013",
				"0x0014",
				"0x0015",
				"0x0016",
				"0x0017",
				"0x0018",
				"0x0019",
				"0x001A",
				"0x001B",
				"0x001C",
				"0x001D",
				"0x001E",
				"0x001F",
				"0x0020",
				"0x0021",
				"0x0022",
				"0x0023",
				"0x0024",
				"0x0025",
				"0x0026",
				"0x0027",
				"0x0028",
				"0x0029",
				"0x002A",
				"0x002B",
				"0x002C",
				"0x002D",
				"0x002E",
				"0x002F",
				"0x0030",
				"0x0031",
				"0x0032",
				"0x0033",
				"0x0034",
				"0x0035",
				"0x0036",
				"0x0037",
				"0x0038",
				"0x0039",
				"0x003A",
				"0x003B",
				"0x003C",
				"0x003D",
				"0x003E",
				"0x003F",
				"0x0040",
				"0x0041",
				"0x0042",
				"0x0043",
				"0x0044",
				"0x0045",
				"0x0046",
				"0x0047",
				"0x0048",
				"0x0049",
				"0x004A",
				"0x004B",
				"0x004C",
				"0x004D",
				"0x004E",
				"0x004F",
				"0x0050",
				"0x0051",
				"0x0052",
				"0x0053",
				"0x0054",
				"0x0055",
				"0x0056",
				"0x0057",
				"0x0058",
				"0x0059",
				"0x005A",
				"0x005B",
				"0x005C",
				"0x005D",
				"0x005E",
				"0x005F",
				"0x0060",
				"0x0061",
				"0x0062",
				"0x0063",
				"0x0064",
				"0x0065",
				"0x0066",
				"0x0067",
				"0x0068",
				"0x0069",
				"0x006A",
				"0x006B",
				"0x006C",
				"0x006D",
				"0x006E",
				"0x006F",
				"0x0070",
				"0x0071",
				"0x0072",
				"0x0073",
				"0x0074",
				"0x0075",
				"0x0076",
				"0x0077",
				"0x0078",
				"0x0079",
				"0x007A",
				"0x007B",
				"0x007C",
				"0x007D",
				"0x007E",
				"0x007F",
				"0x0080",
				"0x0081",
				"0x0082",
				"0x0083",
				"0x0084",
				"0x0085",
				"0x0086",
				"0x0087",
				"0x0088",
				"0x0089",
				"0x008A",
				"0x008B",
				"0x008C",
				"0x008D",
				"0x008E",
				"0x008F",
				"0x0090",
				"0x0091",
				"0x0092",
				"0x0093",
				"0x0094",
				"0x0095",
				"0x0096",
				"0x0097",
				"0x0098",
				"0x0099",
				"0x009A",
				"0x009B",
				"0x009C",
				"0x009D",
				"0x009E",
				"0x009F",
				"0x00A0",
				"0x00A1",
				"0x00A2",
				"0x00A3",
				"0x00A4",
				"0x00A5",
				"0x00A6",
				"0x00A7",
				"0x00A8",
				"0x00A9",
				"0x00AA",
				"0x00AB",
				"0x00AC",
				"0x00AD",
				"0x00AE",
				"0x00AF",
				"0x00B0",
				"0x00B1",
				"0x00B2",
				"0x00B3",
				"0x00B4",
				"0x00B5",
				"0x00B6",
				"0x00B7",
				"0x00B8",
				"0x00B9",
				"0x00BA",
				"0x00BB",
				"0x00BC",
				"0x00BD",
				"0x00BE",
				"0x00BF",
				"0x00C0",
				"0x00C1",
				"0x00C2",
				"0x00C3",
				"0x00C4",
				"0x00C5",
				"0x00C6",
				"0x00C7",
				"0x00C8",
				"0x00C9",
				"0x00CA",
				"0x00CB",
				"0x00CC",
				"0x00CD",
				"0x00CE",
				"0x00CF",
				"0x00D0",
				"0x00D1",
				"0x00D2",
				"0x00D3",
				"0x00D4",
				"0x00D5",
				"0x00D6",
				"0x00D7",
				"0x00D8",
				"0x00D9",
				"0x00DA",
				"0x00DB",
				"0x00DC",
				"0x00DD",
				"0x00DE",
				"0x00DF",
				"0x00E0",
				"0x00E1",
				"0x00E2",
				"0x00E3",
				"0x00E4",
				"0x00E5",
				"0x00E6",
				"0x00E7",
				"0x00E8",
				"0x00E9",
				"0x00EA",
				"0x00EB",
				"0x00EC"
		};
		
		Arrays.asList(units).forEach(p -> {
			System.out.println(p + " : " + getFractionalDigits(p));
		});
		
		  
	}
	
	public static String getFractionalDigits(String units) {
	   
		switch (units) {
	      case BTUS_PER_HOUR: 
	      case CURRENCY10:
	      case DAYS:
	      case DEGREES_ANGULAR:
	      case HUNDREDTHS_SECONDS:
	      case MILLIOHMS:
	      case MILLISECONDS:
	      case MINUTES:
	      case MONTHS:
	      case PARTS_PER_BILLION:
	      case PARTS_PER_MILLION:
	      case REVOLUTIONS_PER_MINUTE:
	      case TON_HOURS:
	      case TONS_REFRIGERATION:
	      case WEEKS:
	      case YEARS:
	      case MICRO_SIEMENS:
	      case CUBIC_FEET_PER_HOUR:
	      case US_GALLONS_PER_HOUR:
	      case KILOMETERS:
	      case MICROMETERS:
	      case GRAMS:
	      case MILLIGRAMS:
	      case MILLILITERS:
	      case MILLILITERS_PER_SECOND:
	      case DECIBELS:
	      case DECIBELS_MILLIVOLT:
	      case DECIBELS_VOLT:
	      case MILLISIEMENS:
	      case WATT_HOURS_REACTIVE:
	      case KILOWATT_HOURS_REACTIVE:
	      case MEGAWATT_HOURS_REACTIVE:
	      case MILLIMETERS_OF_WATER:
	      case PER_MILLE:
	      case GRAMS_PER_GRAM:
	      case KILOGRAMS_PER_KILOGRAM:
	      case GRAMS_PER_KILOGRAM:
	      case MILLIGRAMS_PER_GRAM:
	      case MILLIGRAMS_PER_KILOGRAM:
	      case GRAMS_PER_MILLILETER:
	      case GRAMS_PER_LITER:
	      case MILLIGRAMS_PER_LITER:
	      case MICROGRAMS_PER_LITER:
	      case GRAMS_PER_CUBIC_METER:
	      case MILLIGRAMS_PER_CUBIC_METER:
	      case MICROGRAMS_PER_CUBIC_METER:
	      case NANOGRAMS_PER_CUBIC_METER:
	      case GRAMS_PER_CUBIC_CENTIMETER:
	      case BECQUERELS:
	      case KILOBECQUERELS:
	      case MEGABECQUERELS:
	      case GRAY:
	      case MILLIGRAY:
	      case MICROGRAY:
	      case SIEVERTS:
	      case MILLISIEVERTS:
	      case MICROSIEVERTS:
	      case MICROSIEVERTS_PER_HOUR:
	      case DECIBELS_A:
	      case NEPHELOMETRIC_TURBIDITY_UNIT:
	      case GRAMS_PER_SQUARE_METER:
	      case MINUTES_PER_DEGREE_KELVIN:
	        return "0";

	      case BARS:
	      case CENTIMETERS:
	      case CENTIMETERS_OF_WATER:
	      case CURRENCY1:
	      case DEGREES_CELSIUS:
	      case DEGREES_FAHRENHEIT:
	      case DEGREES_KELVIN:
	      case DELTA_DEGREES_FAHRENHEIT:
	      case DELTA_DEGREES_KELVIN:
	      case HECTOPASCALS:
	      case HERTZ:
	      case HORSEPOWER:
	      case HOURS:
	      case INCHES:
	      case JOULES:
	      case KILOWATT_HOURS:
	      case KILOWATT_HOURS_PER_SQUARE_METER:
	      case LITERS:
	      case LITERS_PER_HOUR:
	      case MEGAVOLTS:
	      case MILLIAMPERES:
	      case MILLIBARS:
	      case MILLIMETERS:
	      case MILLIMETERS_OF_MERCURY:
	      case MILLIVOLTS:
	      case MILLIWATTS:
	      case OHMS:
	      case PASCALS:
	      case PERCENT:
	      case PERCENT_RELATIVE_HUMIDITY:
	      case POUNDS_FORCE_PER_SQUARE_INCH:
	      case VOLT_AMPERES:
	      case WATT_HOURS:
	      case WATTS:
	        return "1";

	      case AMPERES:
	      case AMPERES_PER_METER:
	      case AMPERES_PER_SQUARE_METER:
	      case AMPERES_SQUARE_METERS:
	      case BTUS:
	      case BTUS_PER_POUND:
	      case BTUS_PER_POUND_DRY_AIR:
	      case CANDELAS:
	      case CANDELAS_PER_SQUARE_METER:
	      case CENTIMETERS_OF_MERCURY:
	      case CUBIC_FEET:
	      case CUBIC_FEET_PER_MINUTE:
	      case CUBIC_FEET_PER_SECOND:
	      case CUBIC_METERS:
	      case CUBIC_METERS_PER_HOUR:
	      case CUBIC_METERS_PER_MINUTE:
	      case CUBIC_METERS_PER_SECOND:
	      case CURRENCY2:
	      case CURRENCY4:
	      case CURRENCY5:
	      case CURRENCY6:
	      case CURRENCY7:
	      case CURRENCY8:
	      case CURRENCY9:
	      case CYCLES_PER_HOUR:
	      case CYCLES_PER_MINUTE:
	      case DEGREE_DAYS_CELSIUS:
	      case DEGREE_DAYS_FAHRENHEIT:
	      case DEGREES_CELCIUS_PER_HOUR:
	      case DEGREES_CELCIUS_PER_MINUTE:
	      case DEGREES_FAHRENHEIT_PER_HOUR:
	      case DEGREES_FAHRENHEIT_PER_MINUTE:
	      case DEGREES_KELVIN_PER_HOUR:
	      case DEGREES_KELVIN_PER_MINUTE:
	      case DEGREES_PHASE:
	      case FEET:
	      case FEET_PER_MINUTE:
	      case FEET_PER_SECOND:
	      case FOOT_CANDLES:
	      case GRAMS_OF_WATER_PER_KILOGRAM_DRY_AIR:
	      case GRAMS_PER_MINUTE:
	      case GRAMS_PER_SECOND:
	      case IMPERIAL_GALLONS:
	      case IMPERIAL_GALLONS_PER_MINUTE:
	      case INCHES_OF_MERCURY:
	      case INCHES_OF_WATER:
	      case JOULE_SECONDS:
	      case JOULES_PER_DEGREE_KELVIN:
	      case JOULES_PER_KILOGRAM_DEGREE_KELVIN:
	      case JOULES_PER_KILOGRAM_DRY_AIR:
	      case KILO_BTUS:
	      case KILO_BTUS_PER_HOUR:
	      case KILOGRAMS:
	      case KILOGRAMS_PER_HOUR:
	      case KILOGRAMS_PER_MINUTE:
	      case KILOGRAMS_PER_SECOND:
	      case KILOHERTZ:
	      case KILOHMS:
	      case KILOJOULES:
	      case KILOJOULES_PER_DEGREE_KELVIN:
	      case KILOJOULES_PER_KILOGRAM:
	      case KILOJOULES_PER_KILOGRAM_DRY_AIR:
	      case KILOMETERS_PER_HOUR:
	      case KILOPASCALS:
	      case KILOVOLT_AMPERES:
	      case KILOVOLT_AMPERES_REACTIVE:
	      case KILOVOLTS:
	      case KILOWATT_HOURS_PER_SQUARE_FOOT:
	      case KILOWATTS:
	      case LITERS_PER_MINUTE:
	      case LITERS_PER_SECOND:
	      case LUMENS:
	      case LUXES:
	      case MEGA_BTUS:
	      case MEGAHERTZ:
	      case MEGAJOULES:
	      case MEGAJOULES_PER_DEGREE_KELVIN:
	      case MEGAJOULES_PER_KILOGRAM_DRY_AIR:
	      case MEGAJOULES_PER_SQUARE_FOOT:
	      case MEGAJOULES_PER_SQUARE_METER:
	      case MEGAVOLT_AMPERES:
	      case MEGAVOLT_AMPERES_REACTIVE:
	      case MEGAWATT_HOURS:
	      case MEGAWATTS:
	      case MEGOHMS:
	      case METERS:
	      case METERS_PER_HOUR:
	      case METERS_PER_MINUTE:
	      case METERS_PER_SECOND:
	      case METERS_PER_SECOND_PER_SECOND:
	      case MILES_PER_HOUR:
	      case MILLIMETERS_PER_MINUTE:
	      case MILLIMETERS_PER_SECOND:
	      case NEWTON:
	      case NEWTON_METERS:
	      case NEWTON_SECONDS:
	      case NEWTONS_PER_METER:
	      case NO_UNITS:
	      case OHM_METERS:
	      case PERCENT_OBSCURATION_PER_FOOT:
	      case PERCENT_OBSCURATION_PER_METER:
	      case PERCENT_PER_SECOND:
	      case PER_HOUR:
	      case PER_MINUTE:
	      case PER_SECOND:
	      case PH:
	      case POUNDS_MASS:
	      case POUNDS_MASS_PER_HOUR:
	      case POUNDS_MASS_PER_MINUTE:
	      case POUNDS_MASS_PER_SECOND:
	      case POWER_FACTOR:
	      case PSI_PER_DEGREE_FAHRENHEIT:
	      case RADIANS:
	      case RADIANS_PER_SECOND:
	      case SECONDS:
	      case SIEMENS:
	      case SIEMENS_PER_METER:
	      case SQUARE_CENTIMETERS:
	      case SQUARE_FEET:
	      case SQUARE_INCHES:
	      case SQUARE_METERS:
	      case SQUARE_METERS_PER_NEWTON:
	      case THERMS:
	      case TONS:
	      case TONS_PER_HOUR:
	      case US_GALLONS:
	      case US_GALLONS_PER_MINUTE:
	      case VOLT_AMPERES_REACTIVE:
	      case VOLTS:
	      case VOLTS_PER_DEGREE_KELVIN:
	      case VOLTS_PER_METER:
	      case WATTS_PER_METER_PER_DEGREE_KELVIN:
	      case WATTS_PER_SQUARE_FOOT:
	      case WATTS_PER_SQUARE_METER:
	      case WATTS_PER_SQUARE_METERS_DEGREE_KELVIN:
	        return "2";

	      case CURRENCY3:
	      case KILOGRAMS_PER_CUBIC_METER:
	        return "3";

	      case WEBERS:
	      case FARADS:
	      case HENRYS:
	      case TESLAS:
	        return "6";

	      default:
	        return "-1";
	    }
	  }

}
