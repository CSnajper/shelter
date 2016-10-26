package spring.service.util;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang.RandomStringUtils;

/**
 * Utility class for generating random Strings.
 */
@UtilityClass
public final class RandomUtil {

    private static final int DEF_COUNT = 20;

    /**
     * Generates a password.
     *
     * @return the generated password
     */
    public static String generatePassword() {
        return RandomStringUtils.randomAlphanumeric(DEF_COUNT);
    }

    /**
     * Generates an activation key.
     *
     * @return the generated activation key
     */
    public static String generateActivationKey() {
        return RandomStringUtils.randomNumeric(DEF_COUNT);
    }

    /**
    * Generates a reset key.
    *
    * @return the generated reset key
    */
    public static String generateResetKey() {
        return RandomStringUtils.randomNumeric(DEF_COUNT);
    }
}
