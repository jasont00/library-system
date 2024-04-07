import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AdminTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        java.lang.Class<?> wildcardClass1 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        york.eecs.bt.PhysicalItem physicalItem1 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        york.eecs.bt.PhysicalItem physicalItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        java.lang.Class<?> wildcardClass5 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        york.eecs.bt.PhysicalItem physicalItem1 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        york.eecs.bt.PhysicalItem physicalItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        york.eecs.bt.PhysicalItem physicalItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass5 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        york.eecs.bt.PhysicalItem physicalItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        java.lang.Class<?> wildcardClass8 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        york.eecs.bt.PhysicalItem physicalItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.createItem("", "hi!", "hi!", 0.0d, "", true);
        york.eecs.bt.PhysicalItem physicalItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        java.lang.Class<?> wildcardClass8 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "", (double) 'a', "", false);
        york.eecs.bt.PhysicalItem physicalItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        admin0.createItem("hi!", "", "", (double) 0, "", false);
        java.lang.Class<?> wildcardClass22 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        java.lang.Class<?> wildcardClass13 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        york.eecs.bt.PhysicalItem physicalItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("hi!", "", "hi!");
        york.eecs.bt.PhysicalItem physicalItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "", (double) 'a', "", false);
        york.eecs.bt.PhysicalItem physicalItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.createItem("", "hi!", "hi!", 0.0d, "", true);
        java.lang.Class<?> wildcardClass19 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        admin0.createItem("hi!", "", "", (double) 0, "", false);
        york.eecs.bt.PhysicalItem physicalItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) 0, "hi!", true);
        admin0.addUser("", "", "hi!");
        java.lang.Class<?> wildcardClass24 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.addUser("", "", "hi!");
        admin0.addUser("hi!", "", "hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.addUser("hi!", "hi!", "hi!");
        york.eecs.bt.PhysicalItem physicalItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) 0, "hi!", true);
        york.eecs.bt.PhysicalItem physicalItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.addUser("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        york.eecs.bt.PhysicalItem physicalItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.addUser("", "", "hi!");
        york.eecs.bt.PhysicalItem physicalItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        admin0.createItem("hi!", "", "", 0.0d, "hi!", true);
        java.lang.Class<?> wildcardClass22 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        java.lang.Class<?> wildcardClass15 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.addUser("", "hi!", "hi!");
        york.eecs.bt.PhysicalItem physicalItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        admin0.createItem("", "", "hi!", (double) (byte) 100, "", true);
        york.eecs.bt.PhysicalItem physicalItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        york.eecs.bt.PhysicalItem physicalItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) 0, "hi!", true);
        java.lang.Class<?> wildcardClass20 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 100L, "hi!", true);
        java.lang.Class<?> wildcardClass8 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) 0, "hi!", true);
        admin0.createItem("", "hi!", "", (double) 1, "", true);
        java.lang.Class<?> wildcardClass27 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) 0, "hi!", true);
        admin0.addUser("", "", "hi!");
        admin0.addUser("hi!", "", "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        java.lang.Class<?> wildcardClass9 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("hi!", "", "");
        java.lang.Class<?> wildcardClass13 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "", (double) 'a', "", false);
        admin0.addUser("", "", "hi!");
        york.eecs.bt.PhysicalItem physicalItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.addUser("", "", "");
        york.eecs.bt.PhysicalItem physicalItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        java.lang.Class<?> wildcardClass15 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        admin0.addUser("hi!", "hi!", "");
        york.eecs.bt.PhysicalItem physicalItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        york.eecs.bt.PhysicalItem physicalItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        york.eecs.bt.PhysicalItem physicalItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.createItem("", "", "", (double) (-1.0f), "", false);
        admin0.addUser("hi!", "", "");
        java.lang.Class<?> wildcardClass19 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "", (double) 'a', "", false);
        admin0.addUser("", "", "hi!");
        admin0.addUser("", "hi!", "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "", (double) 'a', "", false);
        admin0.addUser("hi!", "hi!", "");
        york.eecs.bt.PhysicalItem physicalItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        york.eecs.bt.PhysicalItem physicalItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        admin0.createItem("hi!", "", "", 0.0d, "hi!", true);
        admin0.createItem("hi!", "hi!", "", (double) (byte) 1, "hi!", false);
        york.eecs.bt.PhysicalItem physicalItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.addUser("hi!", "", "hi!");
        admin0.createItem("hi!", "", "", 1.0d, "hi!", false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "hi!", 10.0d, "hi!", false);
        java.lang.Class<?> wildcardClass22 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.createItem("hi!", "hi!", "hi!", (double) 100.0f, "hi!", true);
        york.eecs.bt.PhysicalItem physicalItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) 0, "hi!", true);
        admin0.createItem("", "hi!", "", (double) 1, "", true);
        york.eecs.bt.PhysicalItem physicalItem27 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        admin0.createItem("hi!", "", "", 0.0d, "hi!", true);
        admin0.createItem("hi!", "hi!", "", (double) (byte) 1, "hi!", false);
        admin0.createItem("", "hi!", "", (double) (-1L), "hi!", true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.addUser("hi!", "", "hi!");
        admin0.addUser("hi!", "", "hi!");
        york.eecs.bt.PhysicalItem physicalItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("hi!", "", "");
        york.eecs.bt.PhysicalItem physicalItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "hi!", 10.0d, "hi!", false);
        admin0.createItem("hi!", "", "hi!", 10.0d, "", true);
        admin0.createItem("", "hi!", "", (double) 1, "hi!", false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        admin0.createItem("hi!", "", "", 0.0d, "hi!", true);
        york.eecs.bt.PhysicalItem physicalItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "", (double) 'a', "", false);
        admin0.addUser("hi!", "hi!", "");
        admin0.createItem("hi!", "hi!", "hi!", (double) (byte) 1, "", true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.addUser("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        york.eecs.bt.PhysicalItem physicalItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.createItem("", "hi!", "hi!", 0.0d, "", true);
        admin0.addUser("", "hi!", "");
        york.eecs.bt.PhysicalItem physicalItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        admin0.createItem("hi!", "", "", 0.0d, "hi!", true);
        admin0.createItem("hi!", "hi!", "hi!", (double) 10, "hi!", true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "", (double) 'a', "", false);
        admin0.addUser("hi!", "hi!", "");
        admin0.createItem("hi!", "", "hi!", (double) 10, "", false);
        java.lang.Class<?> wildcardClass33 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        admin0.createItem("hi!", "", "", 0.0d, "hi!", true);
        admin0.createItem("hi!", "hi!", "", (double) (byte) 1, "hi!", false);
        java.lang.Class<?> wildcardClass29 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "", (double) 'a', "", false);
        admin0.addUser("", "", "hi!");
        java.lang.Class<?> wildcardClass26 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        admin0.addUser("hi!", "hi!", "");
        york.eecs.bt.PhysicalItem physicalItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("hi!", "", "");
        york.eecs.bt.PhysicalItem physicalItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "", (double) 'a', "", false);
        admin0.addUser("hi!", "hi!", "");
        admin0.createItem("", "hi!", "hi!", (double) (byte) -1, "", false);
        java.lang.Class<?> wildcardClass33 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.addUser("hi!", "", "hi!");
        admin0.addUser("", "", "");
        york.eecs.bt.PhysicalItem physicalItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.addUser("", "", "hi!");
        york.eecs.bt.PhysicalItem physicalItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 100L, "hi!", true);
        york.eecs.bt.PhysicalItem physicalItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "hi!", 10.0d, "hi!", false);
        admin0.createItem("hi!", "", "hi!", 10.0d, "", true);
        admin0.addUser("hi!", "", "hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) 0, "hi!", true);
        admin0.addUser("", "", "hi!");
        admin0.addUser("", "hi!", "hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) (short) 10, "", false);
        york.eecs.bt.PhysicalItem physicalItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.createItem("", "", "", (double) 1, "", true);
        york.eecs.bt.PhysicalItem physicalItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        admin0.createItem("", "", "hi!", (double) (byte) 100, "", true);
        york.eecs.bt.PhysicalItem physicalItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "hi!", (double) 0L, "", true);
        admin0.addUser("hi!", "", "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.addUser("hi!", "", "hi!");
        admin0.addUser("hi!", "", "");
        york.eecs.bt.PhysicalItem physicalItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "hi!", (double) 0L, "", true);
        york.eecs.bt.PhysicalItem physicalItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.createItem("", "", "", (double) (-1.0f), "", false);
        york.eecs.bt.PhysicalItem physicalItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.addUser("hi!", "", "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.createItem("", "", "", (double) (-1.0f), "", false);
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "", "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        admin0.createItem("", "", "hi!", (double) (byte) 100, "", true);
        admin0.addUser("hi!", "", "");
        york.eecs.bt.PhysicalItem physicalItem27 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", 0.0d, "", false);
        java.lang.Class<?> wildcardClass20 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        admin0.createItem("", "", "hi!", (double) (byte) 100, "", true);
        admin0.addUser("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass27 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.addUser("hi!", "hi!", "hi!");
        york.eecs.bt.PhysicalItem physicalItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        admin0.createItem("hi!", "", "", 0.0d, "hi!", true);
        admin0.createItem("hi!", "hi!", "", (double) (byte) 1, "hi!", false);
        york.eecs.bt.PhysicalItem physicalItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.createItem("hi!", "hi!", "hi!", (double) 100.0f, "hi!", true);
        admin0.createItem("", "hi!", "", (double) 10, "hi!", false);
        java.lang.Class<?> wildcardClass26 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) 0, "hi!", true);
        admin0.createItem("", "hi!", "", (double) 1, "", true);
        admin0.addUser("", "hi!", "hi!");
        york.eecs.bt.PhysicalItem physicalItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "hi!", 10.0d, "hi!", false);
        admin0.createItem("hi!", "", "hi!", 10.0d, "", true);
        york.eecs.bt.PhysicalItem physicalItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.createItem("", "", "", (double) (-1.0f), "", false);
        admin0.createItem("hi!", "", "", (double) (-1), "", false);
        java.lang.Class<?> wildcardClass22 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) (short) 10, "", false);
        york.eecs.bt.PhysicalItem physicalItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.addUser("hi!", "", "hi!");
        admin0.addUser("", "", "");
        york.eecs.bt.PhysicalItem physicalItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.createItem("", "", "", (double) (-1.0f), "", false);
        admin0.addUser("hi!", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "", "");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("hi!", "", "hi!");
        admin0.addUser("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass9 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.createItem("hi!", "hi!", "hi!", (double) 100.0f, "hi!", true);
        admin0.createItem("", "hi!", "", (double) 10, "hi!", false);
        york.eecs.bt.PhysicalItem physicalItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.createItem("", "", "", (double) (-1.0f), "", false);
        admin0.createItem("hi!", "", "", (double) (-1), "", false);
        york.eecs.bt.PhysicalItem physicalItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.createItem("", "hi!", "hi!", 10.0d, "hi!", true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.createItem("", "", "", (double) (-1.0f), "", false);
        admin0.addUser("hi!", "", "");
        york.eecs.bt.PhysicalItem physicalItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.addUser("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass19 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) 0, "hi!", true);
        admin0.addUser("", "", "hi!");
        york.eecs.bt.PhysicalItem physicalItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        java.lang.Class<?> wildcardClass16 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "", (double) 'a', "", false);
        admin0.addUser("", "", "hi!");
        admin0.createItem("hi!", "", "", (double) (short) 10, "", true);
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) 1L, "hi!", false);
        york.eecs.bt.PhysicalItem physicalItem44 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        admin0.createItem("", "", "hi!", (double) (byte) 100, "", true);
        admin0.createItem("", "hi!", "", (double) (byte) 1, "", true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        york.eecs.bt.PhysicalItem physicalItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "", (double) 'a', "", false);
        admin0.addUser("", "", "hi!");
        admin0.createItem("hi!", "", "", (double) (short) 10, "", true);
        admin0.addUser("", "hi!", "");
        admin0.createItem("hi!", "", "", (double) (-1), "hi!", false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("hi!", "hi!", "", 0.0d, "", false);
        admin0.createItem("hi!", "", "", (double) 0, "", false);
        admin0.createItem("", "", "", (double) 0.0f, "", false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "hi!");
        admin0.createItem("", "", "", 100.0d, "hi!", false);
        york.eecs.bt.PhysicalItem physicalItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.addUser("hi!", "", "hi!");
        admin0.addUser("hi!", "", "");
        admin0.createItem("", "", "hi!", (double) 100L, "", false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.createItem("hi!", "", "hi!", (double) (byte) 100, "", true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        admin0.createItem("", "", "hi!", (double) (byte) 100, "", true);
        admin0.createItem("", "", "hi!", 10.0d, "", true);
        admin0.createItem("", "hi!", "", (double) 10L, "", true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) 0L, "hi!", false);
        admin0.addUser("", "", "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        admin0.addUser("hi!", "hi!", "");
        admin0.createItem("", "hi!", "hi!", 100.0d, "", true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "hi!", "hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        admin0.createItem("", "", "hi!", (double) (byte) 100, "", true);
        admin0.addUser("", "hi!", "hi!");
        york.eecs.bt.PhysicalItem physicalItem27 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.disableItem(physicalItem27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("hi!", "", "hi!");
        york.eecs.bt.PhysicalItem physicalItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", (double) 0, "hi!", true);
        admin0.addUser("", "", "hi!");
        admin0.createItem("", "", "hi!", (double) 100.0f, "", false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        admin0.createItem("", "", "hi!", (double) (byte) 100, "", true);
        admin0.createItem("", "", "hi!", 10.0d, "", true);
        java.lang.Class<?> wildcardClass30 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        admin0.addUser("hi!", "hi!", "");
        admin0.createItem("", "", "", (double) 10.0f, "hi!", false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.createItem("hi!", "", "", (double) (byte) 0, "hi!", true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "hi!", 10.0d, "hi!", false);
        york.eecs.bt.PhysicalItem physicalItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("hi!", "hi!", "hi!");
        admin0.addUser("hi!", "", "hi!");
        admin0.addUser("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass13 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("hi!", "hi!", "");
        admin0.createItem("hi!", "", "", (double) (short) 100, "hi!", true);
        java.lang.Class<?> wildcardClass20 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.createItem("hi!", "hi!", "", 0.0d, "", true);
        admin0.addUser("hi!", "hi!", "");
        admin0.createItem("", "hi!", "hi!", (double) 'a', "", false);
        java.lang.Class<?> wildcardClass27 = admin0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.addUser("", "", "");
        admin0.createItem("", "", "", (double) (byte) 0, "hi!", false);
        york.eecs.bt.PhysicalItem physicalItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "");
        admin0.createItem("", "", "", 0.0d, "", false);
        york.eecs.bt.PhysicalItem physicalItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin0.enableItem(physicalItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.createItem("", "hi!", "hi!", (double) 100.0f, "", false);
        admin0.createItem("", "hi!", "", (double) 'a', "", false);
        admin0.addUser("hi!", "hi!", "");
        admin0.createItem("", "hi!", "hi!", (double) (byte) -1, "", false);
        admin0.addUser("hi!", "hi!", "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.addUser("", "", "");
        admin0.addUser("hi!", "", "");
        admin0.addUser("", "hi!", "hi!");
        admin0.createItem("hi!", "", "hi!", (double) 10.0f, "", false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        york.eecs.bt.Admin admin0 = new york.eecs.bt.Admin();
        admin0.createItem("", "hi!", "hi!", (double) '#', "", true);
        admin0.addUser("", "", "hi!");
        admin0.createItem("", "", "", (double) (short) 0, "hi!", false);
        admin0.addUser("", "", "hi!");
    }
}

