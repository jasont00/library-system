import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CDTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        java.lang.Class<?> wildcardClass4 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setType("");
        java.lang.String str8 = cD3.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setType("");
        java.lang.Class<?> wildcardClass8 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("hi!", (double) '4', true);
        cD3.setId((int) (short) -1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("Physical Item [name=, id=25, type=cd, price=0.0]", (double) 0L, true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setRentable((java.lang.Boolean) true);
        cD3.setName("Physical Item [name=, id=12, type=cd, price=0.0]");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        java.lang.String str5 = cD3.getOwner();
        cD3.setId(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setType("Physical Item [name=, id=2, type=cd, price=0.0]");
        double double8 = cD3.getPrice();
        cD3.setOwner("Physical Item [name=, id=12, type=cd, price=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        cD3.setType("Physical Item [name=, id=23, type=cd, price=0.0]");
        java.lang.String str7 = cD3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Physical Item [name=, id=45, type=Physical Item [name=, id=23, type=cd, price=0.0], price=0.0]" + "'", str7.equals("Physical Item [name=, id=45, type=Physical Item [name=, id=23, type=cd, price=0.0], price=0.0]"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("hi!", (double) '4', true);
        java.lang.String str4 = cD3.getOwner();
        cD3.setOwner("");
        java.lang.String str7 = cD3.getName();
        double double8 = cD3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        java.lang.String str4 = cD3.toString();
        boolean boolean5 = cD3.getRented();
        boolean boolean6 = cD3.getRented();
        cD3.setRented(false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Physical Item [name=, id=47, type=cd, price=0.0]" + "'", str4.equals("Physical Item [name=, id=47, type=cd, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setRentable((java.lang.Boolean) true);
        cD3.setId((int) (byte) 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("Physical Item [name=, id=23, type=cd, price=0.0]", (-1.0d), false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setType("Physical Item [name=, id=2, type=cd, price=0.0]");
        double double8 = cD3.getPrice();
        java.lang.String str9 = cD3.toString();
        java.lang.Class<?> wildcardClass10 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Physical Item [name=, id=54, type=Physical Item [name=, id=2, type=cd, price=0.0], price=0.0]" + "'", str9.equals("Physical Item [name=, id=54, type=Physical Item [name=, id=2, type=cd, price=0.0], price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        java.lang.String str5 = cD3.getOwner();
        double double6 = cD3.getPrice();
        boolean boolean7 = cD3.getRented();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        boolean boolean5 = cD3.getRentable();
        cD3.setRentable((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        java.lang.String str6 = cD3.toString();
        java.lang.String str7 = cD3.toString();
        cD3.setId((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Physical Item [name=, id=60, type=cd, price=0.0]" + "'", str6.equals("Physical Item [name=, id=60, type=cd, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Physical Item [name=, id=60, type=cd, price=0.0]" + "'", str7.equals("Physical Item [name=, id=60, type=cd, price=0.0]"));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("hi!", (double) '4', true);
        java.lang.String str4 = cD3.getOwner();
        cD3.setOwner("");
        boolean boolean7 = cD3.getRentable();
        cD3.setOwner("Physical Item [name=, id=25, type=cd, price=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        java.lang.String str5 = cD3.getOwner();
        double double6 = cD3.getPrice();
        cD3.setOwner("Physical Item [name=, id=53, type=cd, price=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        java.lang.String str4 = cD3.toString();
        boolean boolean5 = cD3.getRented();
        boolean boolean6 = cD3.getRented();
        int int7 = cD3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Physical Item [name=, id=65, type=cd, price=0.0]" + "'", str4.equals("Physical Item [name=, id=65, type=cd, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65 + "'", int7 == 65);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        java.lang.String str6 = cD3.toString();
        java.lang.String str7 = cD3.toString();
        java.lang.String str8 = cD3.getOwner();
        cD3.setRentable((java.lang.Boolean) false);
        boolean boolean11 = cD3.getRented();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Physical Item [name=, id=66, type=cd, price=0.0]" + "'", str6.equals("Physical Item [name=, id=66, type=cd, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Physical Item [name=, id=66, type=cd, price=0.0]" + "'", str7.equals("Physical Item [name=, id=66, type=cd, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        java.lang.String str6 = cD3.toString();
        double double7 = cD3.getPrice();
        cD3.setRented(false);
        java.lang.String str10 = cD3.getName();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Physical Item [name=, id=67, type=cd, price=0.0]" + "'", str6.equals("Physical Item [name=, id=67, type=cd, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setType("");
        boolean boolean8 = cD3.getRentable();
        double double9 = cD3.getPrice();
        double double10 = cD3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        cD3.setPrice((double) (byte) 100);
        java.lang.String str7 = cD3.getType();
        cD3.setName("");
        double double10 = cD3.getPrice();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "cd" + "'", str7.equals("cd"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        cD3.setPrice((double) (byte) 100);
        cD3.setPrice((double) 65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setRentable((java.lang.Boolean) true);
        cD3.setRentable((java.lang.Boolean) true);
        boolean boolean10 = cD3.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        cD3.setPrice((double) (byte) 100);
        java.lang.String str7 = cD3.getType();
        cD3.setName("");
        cD3.setType("Physical Item [name=, id=47, type=cd, price=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "cd" + "'", str7.equals("cd"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("hi!", (double) '4', true);
        java.lang.String str4 = cD3.getOwner();
        cD3.setOwner("");
        java.lang.String str7 = cD3.getName();
        java.lang.String str8 = cD3.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        cD3.setPrice((double) (byte) 100);
        cD3.setRented(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        cD3.setPrice((double) (byte) 100);
        cD3.setPrice(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("hi!", (double) '4', true);
        java.lang.String str4 = cD3.getOwner();
        cD3.setOwner("");
        cD3.setId(1);
        java.lang.String str9 = cD3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "cd" + "'", str9.equals("cd"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        java.lang.String str4 = cD3.toString();
        boolean boolean5 = cD3.getRented();
        boolean boolean6 = cD3.getRented();
        boolean boolean7 = cD3.getRented();
        java.lang.String str8 = cD3.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Physical Item [name=, id=80, type=cd, price=0.0]" + "'", str4.equals("Physical Item [name=, id=80, type=cd, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=, id=80, type=cd, price=0.0]" + "'", str8.equals("Physical Item [name=, id=80, type=cd, price=0.0]"));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setType("");
        boolean boolean8 = cD3.getRentable();
        double double9 = cD3.getPrice();
        cD3.setId(0);
        int int12 = cD3.getId();
        java.lang.Class<?> wildcardClass13 = cD3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        boolean boolean5 = cD3.getRentable();
        cD3.setName("Physical Item [name=, id=40, type=cd, price=0.0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("Physical Item [name=, id=47, type=cd, price=0.0]", (double) 56, true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("hi!", (double) '4', true);
        java.lang.String str4 = cD3.getOwner();
        cD3.setOwner("");
        boolean boolean7 = cD3.getRentable();
        java.lang.String str8 = cD3.getOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setType("");
        java.lang.String str8 = cD3.getPublisher();
        java.lang.String str9 = cD3.getType();
        java.lang.String str10 = cD3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Physical Item [name=, id=85, type=, price=0.0]" + "'", str10.equals("Physical Item [name=, id=85, type=, price=0.0]"));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setType("Physical Item [name=, id=2, type=cd, price=0.0]");
        double double8 = cD3.getPrice();
        java.lang.String str9 = cD3.toString();
        java.lang.String str10 = cD3.getPublisher();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Physical Item [name=, id=86, type=Physical Item [name=, id=2, type=cd, price=0.0], price=0.0]" + "'", str9.equals("Physical Item [name=, id=86, type=Physical Item [name=, id=2, type=cd, price=0.0], price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        java.lang.String str4 = cD3.toString();
        cD3.setType("Physical Item [name=, id=67, type=cd, price=0.0]");
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Physical Item [name=, id=87, type=cd, price=0.0]" + "'", str4.equals("Physical Item [name=, id=87, type=cd, price=0.0]"));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        java.lang.String str5 = cD3.getOwner();
        java.lang.String str6 = cD3.getType();
        cD3.setRentable((java.lang.Boolean) false);
        boolean boolean9 = cD3.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "cd" + "'", str6.equals("cd"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        java.lang.String str6 = cD3.toString();
        double double7 = cD3.getPrice();
        double double8 = cD3.getPrice();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Physical Item [name=, id=89, type=cd, price=0.0]" + "'", str6.equals("Physical Item [name=, id=89, type=cd, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setType("Physical Item [name=, id=2, type=cd, price=0.0]");
        double double8 = cD3.getPrice();
        java.lang.String str9 = cD3.toString();
        boolean boolean10 = cD3.getRented();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Physical Item [name=, id=90, type=Physical Item [name=, id=2, type=cd, price=0.0], price=0.0]" + "'", str9.equals("Physical Item [name=, id=90, type=Physical Item [name=, id=2, type=cd, price=0.0], price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        java.lang.String str6 = cD3.toString();
        java.lang.String str7 = cD3.toString();
        java.lang.String str8 = cD3.getOwner();
        cD3.setType("Physical Item [name=, id=60, type=cd, price=0.0]");
        cD3.setId((int) '#');
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Physical Item [name=, id=91, type=cd, price=0.0]" + "'", str6.equals("Physical Item [name=, id=91, type=cd, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Physical Item [name=, id=91, type=cd, price=0.0]" + "'", str7.equals("Physical Item [name=, id=91, type=cd, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("hi!", (double) '4', true);
        int int4 = cD3.getId();
        cD3.setPrice((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 92 + "'", int4 == 92);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        java.lang.String str6 = cD3.toString();
        double double7 = cD3.getPrice();
        java.lang.String str8 = cD3.getOwner();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Physical Item [name=, id=93, type=cd, price=0.0]" + "'", str6.equals("Physical Item [name=, id=93, type=cd, price=0.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("hi!", (double) '4', true);
        int int4 = cD3.getId();
        cD3.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 95 + "'", int4 == 95);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("hi!", (double) 1.0f, false);
        java.lang.String str4 = cD3.getOwner();
        boolean boolean5 = cD3.getRentable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("Physical Item [name=, id=35, type=cd, price=0.0]", (double) (byte) -1, true);
        int int4 = cD3.getId();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        cD3.setRented(true);
        cD3.setRentable((java.lang.Boolean) true);
        double double8 = cD3.getPrice();
        cD3.setPrice((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("hi!", (double) '4', true);
        java.lang.String str4 = cD3.getOwner();
        cD3.setOwner("");
        boolean boolean7 = cD3.getRentable();
        java.lang.String str8 = cD3.toString();
        boolean boolean9 = cD3.getRented();
        cD3.setRentable((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Physical Item [name=hi!, id=99, type=cd, price=52.0]" + "'", str8.equals("Physical Item [name=hi!, id=99, type=cd, price=52.0]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        york.eecs.bt.CD cD3 = new york.eecs.bt.CD("", (double) 0L, false);
        boolean boolean4 = cD3.getRented();
        int int5 = cD3.getId();
        java.lang.String str6 = cD3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "cd" + "'", str6.equals("cd"));
    }
}
