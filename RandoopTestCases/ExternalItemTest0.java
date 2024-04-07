import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExternalItemTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (byte) 0, (double) 'a');
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        double double3 = externalItem2.getPrice();
        double double4 = externalItem2.getPrice();
        java.lang.Class<?> wildcardClass5 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        double double3 = externalItem2.getPrice();
        double double4 = externalItem2.getPrice();
        java.lang.Class<?> wildcardClass5 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        externalItem2.setDiscount((double) (-1));
        externalItem2.setDiscount((double) 'a');
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 0L, (double) (byte) 10);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) '4', (double) 100);
        externalItem2.setDiscount((double) (byte) 100);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        double double3 = externalItem2.getPrice();
        java.lang.Class<?> wildcardClass4 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (byte) 1, (double) '4');
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        externalItem2.setDiscount((double) (byte) 100);
        double double5 = externalItem2.getPrice();
        java.lang.Class<?> wildcardClass6 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem(0.0d, (double) 0L);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10.0f, 97.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) -1, 0.0d);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1L), (double) (byte) 100);
        double double3 = externalItem2.getPrice();
        double double4 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 100L, (double) 100);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 100.0f, (double) (short) 10);
        externalItem2.setDiscount((double) (-1));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        externalItem2.setDiscount((double) (-1));
        double double5 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.0d) + "'", double5 == (-0.0d));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (byte) 10, (double) (byte) 10);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        double double3 = externalItem2.getPrice();
        double double4 = externalItem2.getPrice();
        double double5 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 0, (double) (short) -1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 10, 97.0d);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        externalItem2.setDiscount((double) (-1));
        externalItem2.setDiscount((double) '4');
        externalItem2.setDiscount((double) (short) 100);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1L), (double) (byte) 100);
        double double3 = externalItem2.getPrice();
        java.lang.Class<?> wildcardClass4 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        externalItem2.setDiscount((double) 0.0f);
        java.lang.Class<?> wildcardClass5 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 1, (double) 'a');
        double double3 = externalItem2.getPrice();
        externalItem2.setDiscount((double) 100L);
        java.lang.Class<?> wildcardClass6 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        double double3 = externalItem2.getPrice();
        externalItem2.setDiscount(0.0d);
        double double6 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        double double3 = externalItem2.getPrice();
        externalItem2.setDiscount((double) 100);
        externalItem2.setDiscount((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem(97.0d, (double) (short) 0);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1L), (double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) -1, (double) ' ');
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (byte) 1, 1.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem(97.0d, (-1.0d));
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 100.0f, 100.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        double double3 = externalItem2.getPrice();
        externalItem2.setDiscount((double) 100);
        double double6 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 100.0f, (double) (short) 10);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((-1.0d), 10.0d);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        double double3 = externalItem2.getPrice();
        externalItem2.setDiscount((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 100.0f, (double) (short) 10);
        externalItem2.setDiscount(100.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 1L, (double) ' ');
        double double3 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 0, (double) (short) 10);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 10, 97.0d);
        double double3 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 100.0f, (double) 1.0f);
        externalItem2.setDiscount((double) '4');
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) -1, 0.0d);
        externalItem2.setDiscount(100.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        externalItem2.setDiscount((double) (-1));
        externalItem2.setDiscount((double) '4');
        externalItem2.setDiscount((double) 'a');
        java.lang.Class<?> wildcardClass9 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 0, (double) 100.0f);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        externalItem2.setDiscount((double) (-1));
        externalItem2.setDiscount((double) 10);
        externalItem2.setDiscount((-1.0d));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem(97.0d, (double) 10);
        externalItem2.setDiscount((double) (short) 100);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 0L, (double) (byte) 10);
        double double3 = externalItem2.getPrice();
        java.lang.Class<?> wildcardClass4 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 1, (double) 'a');
        double double3 = externalItem2.getPrice();
        externalItem2.setDiscount(10.0d);
        java.lang.Class<?> wildcardClass6 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 100.0f, (double) 1L);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 1.0f, (double) (byte) 1);
        double double3 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 1, (double) 'a');
        double double3 = externalItem2.getPrice();
        double double4 = externalItem2.getPrice();
        java.lang.Class<?> wildcardClass5 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        externalItem2.setDiscount((double) (-1));
        externalItem2.setDiscount((double) '4');
        externalItem2.setDiscount((-1.0d));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, (-1.0d));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (byte) 1, (double) 10L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        double double3 = externalItem2.getPrice();
        externalItem2.setDiscount((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10.0f, 0.0d);
        externalItem2.setDiscount((double) '#');
        externalItem2.setDiscount((double) (short) 10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem(97.0d, (double) ' ');
        externalItem2.setDiscount(0.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10.0f, (double) 0L);
        double double3 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (byte) -1, (double) 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (byte) 0, (-1.0d));
        double double3 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        double double3 = externalItem2.getPrice();
        double double4 = externalItem2.getPrice();
        externalItem2.setDiscount((double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 100, (double) (byte) 10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (byte) 10, (double) (byte) 10);
        externalItem2.setDiscount(97.0d);
        externalItem2.setDiscount((double) 'a');
        externalItem2.setDiscount((double) 100L);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (byte) 10, (double) (byte) 10);
        externalItem2.setDiscount((double) (byte) 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 100, (double) 1.0f);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) '#', (double) 'a');
        externalItem2.setDiscount((double) 10.0f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        externalItem2.setDiscount((double) 0.0f);
        externalItem2.setDiscount(1.0d);
        double double7 = externalItem2.getPrice();
        externalItem2.setDiscount(10.0d);
        externalItem2.setDiscount((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) -1, 0.0d);
        externalItem2.setDiscount((double) 10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) -1, (double) (short) 10);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 100.0f, (double) (short) 10);
        double double3 = externalItem2.getPrice();
        double double4 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 0.0f, (double) '4');
        externalItem2.setDiscount((double) (short) 100);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 'a', (double) (byte) 10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) '4', (double) 100);
        double double3 = externalItem2.getPrice();
        java.lang.Class<?> wildcardClass4 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        externalItem2.setDiscount((double) (-1));
        externalItem2.setDiscount((double) '4');
        externalItem2.setDiscount((double) 'a');
        double double9 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 100, (double) 100);
        double double3 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        externalItem2.setDiscount((double) (byte) -1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        externalItem2.setDiscount((double) (-1));
        externalItem2.setDiscount((double) '#');
        java.lang.Class<?> wildcardClass7 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 100, (double) (short) 10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 0, (double) (short) 10);
        externalItem2.setDiscount((double) '4');
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 1.0f, (double) '4');
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) ' ', (double) 10);
        externalItem2.setDiscount((double) '4');
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        externalItem2.setDiscount((double) (byte) 100);
        java.lang.Class<?> wildcardClass5 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        externalItem2.setDiscount((double) (-1));
        externalItem2.setDiscount((double) '4');
        double double7 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 1, (double) 'a');
        double double3 = externalItem2.getPrice();
        externalItem2.setDiscount(10.0d);
        double double6 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 970.0d + "'", double6 == 970.0d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) ' ', (double) 10);
        externalItem2.setDiscount((double) 100L);
        java.lang.Class<?> wildcardClass5 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (byte) 10, (double) (byte) 10);
        double double3 = externalItem2.getPrice();
        externalItem2.setDiscount((double) (byte) -1);
        externalItem2.setDiscount((-0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) ' ', (double) 10);
        externalItem2.setDiscount((double) 100L);
        double double5 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1000.0d + "'", double5 == 1000.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 1, 100.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 0, (double) (byte) 10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) ' ', (double) 10);
        double double3 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 10, 100.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 100L, (double) 100);
        externalItem2.setDiscount(1.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 0L, (double) (byte) 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem(97.0d, (-1.0d));
        externalItem2.setDiscount((double) (short) -1);
        double double5 = externalItem2.getPrice();
        externalItem2.setDiscount((double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 1.0f, (double) (byte) 1);
        externalItem2.setDiscount((double) (short) -1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem(1000.0d, 10.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        double double3 = externalItem2.getPrice();
        double double4 = externalItem2.getPrice();
        double double5 = externalItem2.getPrice();
        double double6 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        double double3 = externalItem2.getPrice();
        double double4 = externalItem2.getPrice();
        externalItem2.setDiscount(1000.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((-0.0d), (double) (-1));
        double double3 = externalItem2.getPrice();
        java.lang.Class<?> wildcardClass4 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (byte) 10, (double) (byte) 10);
        externalItem2.setDiscount(97.0d);
        externalItem2.setDiscount((double) 'a');
        double double7 = externalItem2.getPrice();
        java.lang.Class<?> wildcardClass8 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 970.0d + "'", double7 == 970.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10.0f, (double) 0L);
        externalItem2.setDiscount((double) (-1L));
        externalItem2.setDiscount((double) (byte) 100);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10, (double) 10.0f);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), 0.0d);
        externalItem2.setDiscount((double) (byte) 100);
        double double5 = externalItem2.getPrice();
        double double6 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (-1.0f), (double) 100);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) '#', (double) 'a');
        double double3 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((-0.0d), (double) (-1L));
        double double3 = externalItem2.getPrice();
        double double4 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 1, (double) 'a');
        double double3 = externalItem2.getPrice();
        externalItem2.setDiscount(10.0d);
        externalItem2.setDiscount((double) ' ');
        double double8 = externalItem2.getPrice();
        java.lang.Class<?> wildcardClass9 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3104.0d + "'", double8 == 3104.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem(97.0d, (double) (byte) 10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 1, (double) 'a');
        double double3 = externalItem2.getPrice();
        externalItem2.setDiscount((double) 100L);
        double double6 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9700.0d + "'", double6 == 9700.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10.0f, 1000.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) '#', (double) (short) -1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, (double) 10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) 10L, 0.0d);
        externalItem2.setDiscount((double) 0.0f);
        externalItem2.setDiscount(1.0d);
        double double7 = externalItem2.getPrice();
        double double8 = externalItem2.getPrice();
        double double9 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) -1, (double) (short) 10);
        double double3 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) 1, (double) 'a');
        double double3 = externalItem2.getPrice();
        externalItem2.setDiscount((double) 100L);
        externalItem2.setDiscount((double) (byte) 0);
        double double8 = externalItem2.getPrice();
        double double9 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((-0.0d), (double) (short) 100);
        java.lang.Class<?> wildcardClass3 = externalItem2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) ' ', (double) 0);
        double double3 = externalItem2.getPrice();
        double double4 = externalItem2.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        york.eecs.bt.ExternalItem externalItem2 = new york.eecs.bt.ExternalItem((double) (short) -1, (double) 100);
        externalItem2.setDiscount((double) (short) 0);
    }
}

