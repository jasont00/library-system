import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NotificationTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        notification3.setType("hi!");
        java.lang.Class<?> wildcardClass6 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        notification3.setContent("");
        notification3.setType("hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getType();
        java.lang.String str5 = notification3.getType();
        java.lang.String str6 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        notification3.setType("hi!");
        java.lang.String str6 = notification3.getType();
        java.lang.Class<?> wildcardClass7 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.Class<?> wildcardClass7 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        java.lang.String str8 = notification3.getType();
        java.lang.String str9 = notification3.getContent();
        notification3.setContent("");
        york.eecs.bt.User user12 = notification3.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        java.lang.String str8 = notification3.getType();
        java.lang.String str9 = notification3.getContent();
        notification3.setType("");
        java.lang.String str12 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        notification3.setContent("hi!");
        java.lang.String str6 = notification3.getType();
        java.lang.Class<?> wildcardClass7 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setContent("");
        york.eecs.bt.User user7 = notification3.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getType();
        java.lang.String str5 = notification3.getType();
        java.lang.Class<?> wildcardClass6 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        york.eecs.bt.User user8 = notification3.getUser();
        york.eecs.bt.User user9 = null;
        notification3.setUser(user9);
        java.lang.Class<?> wildcardClass11 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getType();
        java.lang.String str5 = notification3.getType();
        york.eecs.bt.User user6 = notification3.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        java.lang.String str4 = notification3.getContent();
        java.lang.Class<?> wildcardClass5 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        york.eecs.bt.User user8 = notification3.getUser();
        notification3.setType("");
        java.lang.String str11 = notification3.getContent();
        java.lang.String str12 = notification3.getType();
        york.eecs.bt.User user13 = null;
        notification3.setUser(user13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = user5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "");
        java.lang.Class<?> wildcardClass4 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        java.lang.String str8 = notification3.getType();
        java.lang.String str9 = notification3.getContent();
        java.lang.Class<?> wildcardClass10 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        notification3.setType("hi!");
        notification3.setContent("");
        notification3.setType("hi!");
        york.eecs.bt.User user10 = null;
        notification3.setUser(user10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "hi!");
        java.lang.String str4 = notification3.getType();
        notification3.setContent("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        notification3.setContent("hi!");
        notification3.setContent("");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        york.eecs.bt.User user8 = notification3.getUser();
        york.eecs.bt.User user9 = null;
        notification3.setUser(user9);
        notification3.setContent("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        java.lang.String str8 = notification3.getType();
        york.eecs.bt.User user9 = notification3.getUser();
        york.eecs.bt.User user10 = null;
        notification3.setUser(user10);
        york.eecs.bt.User user12 = null;
        notification3.setUser(user12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        york.eecs.bt.User user4 = notification3.getUser();
        java.lang.Class<?> wildcardClass5 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getType();
        java.lang.Class<?> wildcardClass5 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        york.eecs.bt.User user8 = notification3.getUser();
        york.eecs.bt.User user9 = null;
        notification3.setUser(user9);
        york.eecs.bt.User user11 = null;
        notification3.setUser(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        java.lang.String str4 = notification3.getType();
        java.lang.Class<?> wildcardClass5 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        java.lang.String str8 = notification3.getType();
        york.eecs.bt.User user9 = null;
        notification3.setUser(user9);
        york.eecs.bt.User user11 = null;
        notification3.setUser(user11);
        java.lang.String str13 = notification3.getContent();
        notification3.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getType();
        notification3.setContent("");
        york.eecs.bt.User user7 = notification3.getUser();
        java.lang.String str8 = notification3.getType();
        notification3.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        notification3.setContent("hi!");
        york.eecs.bt.User user6 = notification3.getUser();
        notification3.setContent("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        notification3.setType("hi!");
        york.eecs.bt.User user6 = null;
        notification3.setUser(user6);
        java.lang.String str8 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        notification3.setType("hi!");
        notification3.setContent("");
        java.lang.String str8 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        notification3.setType("");
        java.lang.String str9 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        notification3.setType("hi!");
        notification3.setContent("hi!");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        notification3.setContent("");
        york.eecs.bt.User user6 = notification3.getUser();
        java.lang.String str7 = notification3.getContent();
        java.lang.Class<?> wildcardClass8 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "hi!");
        notification3.setType("hi!");
        york.eecs.bt.User user6 = notification3.getUser();
        york.eecs.bt.User user7 = notification3.getUser();
        york.eecs.bt.User user8 = notification3.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        notification3.setType("");
        york.eecs.bt.User user9 = notification3.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        york.eecs.bt.User user8 = notification3.getUser();
        notification3.setType("");
        java.lang.String str11 = notification3.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "");
        york.eecs.bt.User user4 = null;
        notification3.setUser(user4);
        notification3.setType("");
        york.eecs.bt.User user8 = notification3.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("hi!");
        java.lang.Class<?> wildcardClass7 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        notification3.setType("hi!");
        york.eecs.bt.User user6 = null;
        notification3.setUser(user6);
        java.lang.String str8 = notification3.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        notification3.setType("");
        notification3.setContent("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        york.eecs.bt.User user8 = notification3.getUser();
        notification3.setType("");
        java.lang.String str11 = notification3.getContent();
        java.lang.String str12 = notification3.getType();
        notification3.setType("");
        java.lang.Class<?> wildcardClass15 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        york.eecs.bt.User user7 = notification3.getUser();
        york.eecs.bt.User user8 = notification3.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "");
        notification3.setContent("");
        york.eecs.bt.User user6 = null;
        notification3.setUser(user6);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "");
        java.lang.String str4 = notification3.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        york.eecs.bt.User user8 = null;
        notification3.setUser(user8);
        notification3.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        java.lang.String str8 = notification3.getType();
        java.lang.String str9 = notification3.getContent();
        york.eecs.bt.User user10 = notification3.getUser();
        york.eecs.bt.User user11 = notification3.getUser();
        java.lang.String str12 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        york.eecs.bt.User user8 = notification3.getUser();
        notification3.setType("");
        java.lang.Class<?> wildcardClass11 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        java.lang.String str8 = notification3.getType();
        java.lang.String str9 = notification3.getContent();
        notification3.setContent("");
        notification3.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        notification3.setContent("hi!");
        york.eecs.bt.User user6 = notification3.getUser();
        york.eecs.bt.User user7 = notification3.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        java.lang.String str8 = notification3.getType();
        java.lang.String str9 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "hi!");
        york.eecs.bt.User user4 = null;
        notification3.setUser(user4);
        notification3.setContent("");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "hi!");
        notification3.setType("hi!");
        notification3.setContent("hi!");
        notification3.setContent("");
        notification3.setType("hi!");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        york.eecs.bt.User user4 = notification3.getUser();
        notification3.setContent("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        york.eecs.bt.User user8 = notification3.getUser();
        java.lang.String str9 = notification3.getContent();
        notification3.setType("");
        york.eecs.bt.User user12 = notification3.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getType();
        java.lang.String str5 = notification3.getContent();
        java.lang.Class<?> wildcardClass6 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        notification3.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        notification3.setContent("");
        york.eecs.bt.User user6 = notification3.getUser();
        java.lang.String str7 = notification3.getContent();
        java.lang.String str8 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "");
        york.eecs.bt.User user4 = notification3.getUser();
        notification3.setContent("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        java.lang.String str8 = notification3.getType();
        york.eecs.bt.User user9 = null;
        notification3.setUser(user9);
        java.lang.String str11 = notification3.getContent();
        notification3.setType("");
        york.eecs.bt.User user14 = null;
        notification3.setUser(user14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        java.lang.String str8 = notification3.getType();
        york.eecs.bt.User user9 = null;
        notification3.setUser(user9);
        york.eecs.bt.User user11 = null;
        notification3.setUser(user11);
        java.lang.String str13 = notification3.getContent();
        java.lang.String str14 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "hi!");
        java.lang.String str4 = notification3.getType();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        york.eecs.bt.User user8 = notification3.getUser();
        notification3.setType("");
        notification3.setContent("hi!");
        java.lang.Class<?> wildcardClass13 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        york.eecs.bt.User user8 = notification3.getUser();
        java.lang.String str9 = notification3.getType();
        york.eecs.bt.User user10 = notification3.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        java.lang.String str8 = notification3.getType();
        york.eecs.bt.User user9 = notification3.getUser();
        notification3.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        york.eecs.bt.User user8 = notification3.getUser();
        java.lang.String str9 = notification3.getContent();
        java.lang.Class<?> wildcardClass10 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        notification3.setContent("");
        york.eecs.bt.User user6 = notification3.getUser();
        notification3.setContent("");
        notification3.setType("hi!");
        java.lang.Class<?> wildcardClass11 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        york.eecs.bt.User user4 = notification3.getUser();
        java.lang.String str5 = notification3.getContent();
        java.lang.Class<?> wildcardClass6 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "hi!");
        york.eecs.bt.User user4 = null;
        notification3.setUser(user4);
        york.eecs.bt.User user6 = notification3.getUser();
        york.eecs.bt.User user7 = null;
        notification3.setUser(user7);
        java.lang.Class<?> wildcardClass9 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        york.eecs.bt.User user8 = notification3.getUser();
        york.eecs.bt.User user9 = null;
        notification3.setUser(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        notification3.setContent("hi!");
        york.eecs.bt.User user6 = notification3.getUser();
        notification3.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        york.eecs.bt.User user8 = notification3.getUser();
        java.lang.String str9 = notification3.getType();
        java.lang.String str10 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "hi!");
        java.lang.String str4 = notification3.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        york.eecs.bt.User user8 = notification3.getUser();
        york.eecs.bt.User user9 = notification3.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        java.lang.String str8 = notification3.getType();
        java.lang.String str9 = notification3.getContent();
        notification3.setContent("");
        java.lang.String str12 = notification3.getContent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "hi!");
        notification3.setType("hi!");
        york.eecs.bt.User user6 = null;
        notification3.setUser(user6);
        york.eecs.bt.User user8 = null;
        notification3.setUser(user8);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        york.eecs.bt.User user8 = notification3.getUser();
        notification3.setType("");
        java.lang.String str11 = notification3.getContent();
        java.lang.String str12 = notification3.getType();
        notification3.setContent("hi!");
        notification3.setType("");
        java.lang.String str17 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "");
        york.eecs.bt.User user4 = null;
        notification3.setUser(user4);
        notification3.setType("");
        java.lang.String str8 = notification3.getType();
        java.lang.Class<?> wildcardClass9 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        java.lang.String str6 = notification3.getType();
        york.eecs.bt.User user7 = notification3.getUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "hi!");
        york.eecs.bt.User user4 = null;
        notification3.setUser(user4);
        java.lang.String str6 = notification3.getType();
        york.eecs.bt.User user7 = notification3.getUser();
        java.lang.String str8 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        york.eecs.bt.User user4 = notification3.getUser();
        notification3.setContent("hi!");
        java.lang.String str7 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        york.eecs.bt.User user8 = notification3.getUser();
        notification3.setType("");
        java.lang.String str11 = notification3.getContent();
        java.lang.String str12 = notification3.getContent();
        java.lang.Class<?> wildcardClass13 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        york.eecs.bt.User user4 = notification3.getUser();
        notification3.setContent("hi!");
        java.lang.Class<?> wildcardClass7 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = null;
        notification3.setUser(user5);
        york.eecs.bt.User user7 = null;
        notification3.setUser(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        java.lang.String str8 = notification3.getType();
        java.lang.String str9 = notification3.getContent();
        java.lang.String str10 = notification3.getContent();
        notification3.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        notification3.setContent("hi!");
        york.eecs.bt.User user6 = null;
        notification3.setUser(user6);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "");
        york.eecs.bt.User user4 = null;
        notification3.setUser(user4);
        notification3.setType("");
        java.lang.String str8 = notification3.getType();
        york.eecs.bt.User user9 = null;
        notification3.setUser(user9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "hi!");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("hi!");
        york.eecs.bt.User user7 = null;
        notification3.setUser(user7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        java.lang.String str8 = notification3.getType();
        java.lang.String str9 = notification3.getContent();
        york.eecs.bt.User user10 = null;
        notification3.setUser(user10);
        york.eecs.bt.User user12 = notification3.getUser();
        notification3.setType("");
        york.eecs.bt.User user15 = null;
        notification3.setUser(user15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        notification3.setType("hi!");
        york.eecs.bt.User user6 = null;
        notification3.setUser(user6);
        notification3.setType("hi!");
        java.lang.String str10 = notification3.getContent();
        java.lang.String str11 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        notification3.setType("");
        java.lang.String str7 = notification3.getContent();
        york.eecs.bt.User user8 = null;
        notification3.setUser(user8);
        java.lang.Class<?> wildcardClass10 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        york.eecs.bt.User user8 = notification3.getUser();
        notification3.setType("");
        java.lang.String str11 = notification3.getContent();
        java.lang.String str12 = notification3.getContent();
        notification3.setContent("");
        notification3.setContent("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "hi!");
        york.eecs.bt.User user4 = null;
        notification3.setUser(user4);
        york.eecs.bt.User user6 = notification3.getUser();
        notification3.setContent("");
        java.lang.Class<?> wildcardClass9 = notification3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        java.lang.String str4 = notification3.getContent();
        york.eecs.bt.User user5 = notification3.getUser();
        notification3.setContent("hi!");
        java.lang.String str8 = notification3.getType();
        java.lang.String str9 = notification3.getContent();
        york.eecs.bt.User user10 = notification3.getUser();
        york.eecs.bt.User user11 = notification3.getUser();
        java.lang.String str12 = notification3.getContent();
        york.eecs.bt.User user13 = notification3.getUser();
        notification3.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        notification3.setType("hi!");
        notification3.setContent("");
        notification3.setType("hi!");
        notification3.setType("hi!");
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "", "");
        york.eecs.bt.User user4 = null;
        notification3.setUser(user4);
        notification3.setContent("hi!");
        java.lang.String str8 = notification3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test99");
        york.eecs.bt.User user0 = null;
        york.eecs.bt.Notification notification3 = new york.eecs.bt.Notification(user0, "hi!", "");
        notification3.setType("hi!");
        york.eecs.bt.User user6 = null;
        notification3.setUser(user6);
        notification3.setType("hi!");
        notification3.setType("");
    }
}

