package io.oscal4neo4j.api;

/**
 * Some constants that were extracted from the generated content.
 *
 */
public class ValidationConstants {
    public static final String REGEX_MIN_ONE_CHAR = "^\\S(.*\\S)?$";
    public static final String REGEX_DATE_TIME = "^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)|(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))|(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))T(2[0-3]|[01][0-9]):([0-5][0-9]):([0-5][0-9])(\\.[0-9]+)?(Z|[+-][0-9]{2}:[0-9]{2})$";
}
