package classwork.bank.utility;

import classwork.bank.utility.CollectionUtility;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BankingTest {

    @Test
    public void nullSafeShouldReturnEmptyListIfNull(){
        final List<Object> actual = CollectionUtility.nullSafeListInit(null);
        Assert.assertTrue(actual.isEmpty());
    }

    @Test
    public void nullSafeShouldReturnEmptyListIfNotNull(){
        List<Integer> items = Arrays.asList(1, 2, 3);
        final List<Integer> actual = CollectionUtility.nullSafeListInit(items);
        Assert.assertFalse(actual.isEmpty());
        Assert.assertEquals(3, actual.size());
    }


}
