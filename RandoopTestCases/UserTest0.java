import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        york.eecs.bt.PhysicalItem physicalItem4 = null;
        user3.unRentItem(physicalItem4);
        york.eecs.bt.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            user3.subscribe(newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        york.eecs.bt.Newsletter newsletter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            user3.subscribe(newsletter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        york.eecs.bt.User user18 = new york.eecs.bt.User("", "", "");
        user18.rentEligible = false;
        int int21 = user18.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList22 = user18.getNotificationList();
        user3.setNotificationList(notificationList22);
        java.lang.Class<?> wildcardClass24 = notificationList22.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        user3.viewTextbooks();
        java.lang.String str9 = user3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        boolean boolean6 = user3.checkPrivileges();
        user3.setType("hi!");
        java.lang.Class<?> wildcardClass9 = user3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.lang.String str5 = user3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        boolean boolean7 = user3.checkPrivileges();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        user3.viewCourses();
        java.util.List<york.eecs.bt.Course> courseList7 = user3.getCourses();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        boolean boolean6 = user3.checkPrivileges();
        user3.setType("hi!");
        int int9 = user3.countRentSize();
        user3.viewTextbooks();
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap11 = null;
        user3.rentedItems = physicalItemMap11;
        york.eecs.bt.PhysicalItem physicalItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = user3.rentItem(physicalItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        java.lang.Class<?> wildcardClass15 = user3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        java.util.List<york.eecs.bt.Notification> notificationList15 = user3.getNotificationList();
        user3.setPassword("");
        double double18 = user3.calculatePenalty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        int int11 = user3.countLost();
        user3.viewTextbooks();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        java.util.List<york.eecs.bt.Notification> notificationList15 = user3.getNotificationList();
        user3.setType("");
        user3.rentEligible = true;
        user3.viewCourses();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList15);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        int int5 = user3.countOverDue();
        york.eecs.bt.PhysicalItem physicalItem6 = null;
        user3.unRentItem(physicalItem6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        user3.viewCourses();
        user3.setPassword("hi!");
        java.util.List<york.eecs.bt.Notification> notificationList9 = user3.getNotificationList();
        java.lang.String str10 = user3.getPassword();
        york.eecs.bt.Newsletter newsletter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            user3.subscribe(newsletter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.lang.String str5 = user3.getType();
        user3.rentEligible = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countOverDue();
        java.lang.String str7 = user3.getType();
        int int8 = user3.countOverDue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "hi!");
        york.eecs.bt.Newsletter newsletter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            user3.subscribe(newsletter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        user3.viewTextbooks();
        user3.setType("hi!");
        york.eecs.bt.Course course14 = null;
        user3.addCourse(course14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap4 = user3.rentedItems;
        user3.rentEligible = true;
        york.eecs.bt.PhysicalItem physicalItem7 = null;
        user3.unRentItem(physicalItem7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countOverDue();
        york.eecs.bt.Newsletter newsletter7 = null;
        user3.cancel(newsletter7);
        user3.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        int int11 = user3.countLost();
        java.lang.String str12 = user3.getPassword();
        java.lang.String str13 = user3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.lang.Class<?> wildcardClass7 = user3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        int int11 = user3.countOverDue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        user3.viewCourses();
        java.lang.Class<?> wildcardClass7 = user3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.lang.String str5 = user3.getType();
        york.eecs.bt.PhysicalItem physicalItem6 = null;
        user3.unRentItem(physicalItem6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        york.eecs.bt.User user10 = new york.eecs.bt.User("", "", "");
        user10.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList12 = user10.listSubscription();
        york.eecs.bt.User user16 = new york.eecs.bt.User("", "", "");
        user16.rentEligible = false;
        int int19 = user16.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList20 = user16.getNotificationList();
        user10.setNotificationList(notificationList20);
        java.util.List<york.eecs.bt.Notification> notificationList22 = user10.getNotificationList();
        java.util.List<york.eecs.bt.Notification> notificationList23 = user10.getNotificationList();
        user3.setNotificationList(notificationList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList23);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        york.eecs.bt.User user3 = new york.eecs.bt.User("hi!", "", "");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.lang.String str5 = user3.getType();
        york.eecs.bt.Newsletter newsletter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            user3.subscribe(newsletter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countOverDue();
        boolean boolean7 = user3.getRE();
        user3.viewCourses();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        java.util.List<york.eecs.bt.Notification> notificationList15 = user3.getNotificationList();
        user3.setType("");
        boolean boolean18 = user3.getRE();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        int int5 = user3.countOverDue();
        boolean boolean6 = user3.checkPrivileges();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        double double11 = user3.calculatePenalty();
        user3.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        york.eecs.bt.Newsletter newsletter7 = null;
        user3.cancel(newsletter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.lang.String str5 = user3.getType();
        user3.viewCourses();
        york.eecs.bt.Newsletter newsletter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            user3.subscribe(newsletter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countOverDue();
        java.lang.String str7 = user3.getType();
        java.util.List<york.eecs.bt.Newsletter> newsletterList8 = user3.listSubscription();
        java.util.List<york.eecs.bt.Course> courseList9 = user3.getCourses();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList9);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        york.eecs.bt.User user18 = new york.eecs.bt.User("", "", "");
        user18.rentEligible = false;
        int int21 = user18.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList22 = user18.getNotificationList();
        user3.setNotificationList(notificationList22);
        java.lang.String str24 = user3.getEmail();
        york.eecs.bt.User user28 = new york.eecs.bt.User("", "", "");
        user28.viewTextbooks();
        java.lang.String str30 = user28.getType();
        york.eecs.bt.User user34 = new york.eecs.bt.User("", "", "");
        user34.rentEligible = false;
        boolean boolean37 = user34.checkPrivileges();
        user34.setType("hi!");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap40 = user34.rentedItems;
        user28.rentedItems = physicalItemMap40;
        user3.rentedItems = physicalItemMap40;
        int int43 = user3.countOverDue();
        java.lang.String str44 = user3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        york.eecs.bt.PhysicalItem physicalItem4 = null;
        user3.unRentItem(physicalItem4);
        york.eecs.bt.PhysicalItem physicalItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = user3.rentItem(physicalItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        int int11 = user3.countLost();
        java.lang.String str12 = user3.getPassword();
        user3.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        java.util.List<york.eecs.bt.Notification> notificationList15 = user3.getNotificationList();
        java.util.List<york.eecs.bt.Notification> notificationList16 = user3.getNotificationList();
        user3.rentEligible = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList16);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        user3.setEmail("");
        york.eecs.bt.User user11 = new york.eecs.bt.User("", "", "");
        york.eecs.bt.PhysicalItem physicalItem12 = null;
        user11.unRentItem(physicalItem12);
        java.lang.String str14 = user11.getEmail();
        york.eecs.bt.User user18 = new york.eecs.bt.User("", "", "");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap19 = user18.rentedItems;
        user11.rentedItems = physicalItemMap19;
        user3.rentedItems = physicalItemMap19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap19);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        boolean boolean6 = user3.checkPrivileges();
        user3.setType("hi!");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap9 = null;
        user3.rentedItems = physicalItemMap9;
        boolean boolean11 = user3.rentEligible;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        york.eecs.bt.User user18 = new york.eecs.bt.User("", "", "");
        user18.rentEligible = false;
        int int21 = user18.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList22 = user18.getNotificationList();
        user3.setNotificationList(notificationList22);
        user3.setRentEligible((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList22);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Course> courseList5 = user3.getCourses();
        user3.setRentEligible((java.lang.Boolean) false);
        boolean boolean8 = user3.getRE();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        java.lang.String str6 = user3.getEmail();
        boolean boolean7 = user3.checkPrivileges();
        york.eecs.bt.Newsletter newsletter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            user3.subscribe(newsletter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        boolean boolean6 = user3.checkPrivileges();
        user3.setType("hi!");
        int int9 = user3.countRentSize();
        user3.viewTextbooks();
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap11 = null;
        user3.rentedItems = physicalItemMap11;
        java.lang.String str13 = user3.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = user3.calculatePenalty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        boolean boolean6 = user3.checkPrivileges();
        java.util.List<york.eecs.bt.Course> courseList7 = user3.getCourses();
        java.util.List<york.eecs.bt.Notification> notificationList8 = user3.getNotificationList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList8);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        java.lang.String str6 = user3.getEmail();
        boolean boolean7 = user3.checkPrivileges();
        int int8 = user3.countOverDue();
        york.eecs.bt.PhysicalItem physicalItem9 = null;
        user3.unRentItem(physicalItem9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        boolean boolean6 = user3.checkPrivileges();
        user3.setType("hi!");
        user3.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap4 = user3.rentedItems;
        user3.rentEligible = true;
        user3.setType("hi!");
        java.lang.String str9 = user3.getPassword();
        java.lang.String str10 = user3.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        boolean boolean6 = user3.checkPrivileges();
        user3.setType("hi!");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap9 = null;
        user3.rentedItems = physicalItemMap9;
        java.lang.String str11 = user3.getType();
        york.eecs.bt.User user15 = new york.eecs.bt.User("", "", "");
        user15.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList17 = user15.listSubscription();
        york.eecs.bt.User user21 = new york.eecs.bt.User("", "", "");
        user21.rentEligible = false;
        int int24 = user21.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList25 = user21.getNotificationList();
        user15.setNotificationList(notificationList25);
        york.eecs.bt.User user30 = new york.eecs.bt.User("", "", "");
        user30.rentEligible = false;
        int int33 = user30.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList34 = user30.getNotificationList();
        user15.setNotificationList(notificationList34);
        java.lang.String str36 = user15.getEmail();
        york.eecs.bt.User user40 = new york.eecs.bt.User("", "", "");
        user40.viewTextbooks();
        java.lang.String str42 = user40.getType();
        york.eecs.bt.User user46 = new york.eecs.bt.User("", "", "");
        user46.rentEligible = false;
        boolean boolean49 = user46.checkPrivileges();
        user46.setType("hi!");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap52 = user46.rentedItems;
        user40.rentedItems = physicalItemMap52;
        user15.rentedItems = physicalItemMap52;
        user3.rentedItems = physicalItemMap52;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap52);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        boolean boolean6 = user3.checkPrivileges();
        double double7 = user3.calculatePenalty();
        java.lang.String str8 = user3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        york.eecs.bt.User user18 = new york.eecs.bt.User("", "", "");
        user18.rentEligible = false;
        int int21 = user18.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList22 = user18.getNotificationList();
        user3.setNotificationList(notificationList22);
        int int24 = user3.countLost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        java.util.List<york.eecs.bt.Notification> notificationList15 = user3.getNotificationList();
        user3.setType("hi!");
        user3.setPassword("hi!");
        int int20 = user3.countRentSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        york.eecs.bt.PhysicalItem physicalItem4 = null;
        user3.unRentItem(physicalItem4);
        java.lang.String str6 = user3.getEmail();
        york.eecs.bt.Newsletter newsletter7 = null;
        user3.cancel(newsletter7);
        user3.setRentEligible((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        java.lang.String str6 = user3.getEmail();
        boolean boolean7 = user3.checkPrivileges();
        user3.rentEligible = false;
        user3.setPassword("");
        java.util.List<york.eecs.bt.Notification> notificationList12 = user3.getNotificationList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList12);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.lang.String str5 = user3.getType();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        boolean boolean12 = user9.checkPrivileges();
        user9.setType("hi!");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap15 = user9.rentedItems;
        user3.rentedItems = physicalItemMap15;
        java.lang.Class<?> wildcardClass17 = physicalItemMap15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        york.eecs.bt.PhysicalItem physicalItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = user3.rentItem(physicalItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        user3.viewCourses();
        int int7 = user3.countRentSize();
        user3.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.lang.String str5 = user3.getType();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        boolean boolean12 = user9.checkPrivileges();
        user9.setType("hi!");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap15 = user9.rentedItems;
        user3.rentedItems = physicalItemMap15;
        york.eecs.bt.User user20 = new york.eecs.bt.User("", "", "");
        user20.rentEligible = false;
        int int23 = user20.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList24 = user20.getNotificationList();
        boolean boolean25 = user20.getRE();
        user20.setPassword("");
        york.eecs.bt.User user31 = new york.eecs.bt.User("", "", "");
        user31.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList33 = user31.listSubscription();
        york.eecs.bt.User user37 = new york.eecs.bt.User("", "", "");
        user37.rentEligible = false;
        int int40 = user37.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList41 = user37.getNotificationList();
        user31.setNotificationList(notificationList41);
        york.eecs.bt.User user46 = new york.eecs.bt.User("", "", "");
        user46.rentEligible = false;
        int int49 = user46.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList50 = user46.getNotificationList();
        user31.setNotificationList(notificationList50);
        java.lang.String str52 = user31.getEmail();
        york.eecs.bt.User user56 = new york.eecs.bt.User("", "", "");
        user56.viewTextbooks();
        java.lang.String str58 = user56.getType();
        york.eecs.bt.User user62 = new york.eecs.bt.User("", "", "");
        user62.rentEligible = false;
        boolean boolean65 = user62.checkPrivileges();
        user62.setType("hi!");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap68 = user62.rentedItems;
        user56.rentedItems = physicalItemMap68;
        user31.rentedItems = physicalItemMap68;
        user20.rentedItems = physicalItemMap68;
        user3.rentedItems = physicalItemMap68;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap68);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap4 = user3.rentedItems;
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.PhysicalItem physicalItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = user3.rentItem(physicalItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        java.util.List<york.eecs.bt.Notification> notificationList15 = user3.getNotificationList();
        java.util.List<york.eecs.bt.Notification> notificationList16 = user3.getNotificationList();
        double double17 = user3.calculatePenalty();
        user3.viewTextbooks();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap4 = user3.rentedItems;
        york.eecs.bt.User user8 = new york.eecs.bt.User("", "", "");
        user8.rentEligible = false;
        int int11 = user8.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList12 = user8.getNotificationList();
        user8.viewTextbooks();
        user8.viewTextbooks();
        york.eecs.bt.User user18 = new york.eecs.bt.User("", "", "");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap19 = user18.rentedItems;
        user8.rentedItems = physicalItemMap19;
        user3.rentedItems = physicalItemMap19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap19);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        java.lang.String str6 = user3.getEmail();
        boolean boolean7 = user3.checkPrivileges();
        int int8 = user3.countOverDue();
        user3.setType("");
        user3.viewCourses();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        java.util.List<york.eecs.bt.Notification> notificationList4 = user3.getNotificationList();
        int int5 = user3.countRentSize();
        java.util.List<york.eecs.bt.Notification> notificationList6 = user3.getNotificationList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList6);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        york.eecs.bt.User user14 = new york.eecs.bt.User("", "", "");
        user14.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList16 = user14.listSubscription();
        york.eecs.bt.User user20 = new york.eecs.bt.User("", "", "");
        user20.rentEligible = false;
        int int23 = user20.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList24 = user20.getNotificationList();
        user14.setNotificationList(notificationList24);
        york.eecs.bt.User user29 = new york.eecs.bt.User("", "", "");
        user29.rentEligible = false;
        int int32 = user29.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList33 = user29.getNotificationList();
        user14.setNotificationList(notificationList33);
        java.lang.String str35 = user14.getEmail();
        york.eecs.bt.User user39 = new york.eecs.bt.User("", "", "");
        user39.viewTextbooks();
        java.lang.String str41 = user39.getType();
        york.eecs.bt.User user45 = new york.eecs.bt.User("", "", "");
        user45.rentEligible = false;
        boolean boolean48 = user45.checkPrivileges();
        user45.setType("hi!");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap51 = user45.rentedItems;
        user39.rentedItems = physicalItemMap51;
        user14.rentedItems = physicalItemMap51;
        user3.rentedItems = physicalItemMap51;
        boolean boolean55 = user3.getRE();
        java.lang.String str56 = user3.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        york.eecs.bt.Newsletter newsletter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            user3.subscribe(newsletter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        java.util.List<york.eecs.bt.Notification> notificationList4 = user3.getNotificationList();
        boolean boolean5 = user3.getRE();
        java.util.List<york.eecs.bt.Course> courseList6 = user3.getCourses();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList6);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        boolean boolean6 = user3.checkPrivileges();
        user3.setType("hi!");
        int int9 = user3.countRentSize();
        user3.viewTextbooks();
        user3.setRentEligible((java.lang.Boolean) false);
        york.eecs.bt.PhysicalItem physicalItem13 = null;
        user3.unRentItem(physicalItem13);
        york.eecs.bt.PhysicalItem physicalItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = user3.rentItem(physicalItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        java.lang.String str6 = user3.getEmail();
        double double7 = user3.calculatePenalty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        java.lang.String str6 = user3.getEmail();
        york.eecs.bt.Course course7 = null;
        user3.addCourse(course7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.lang.String str5 = user3.getType();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        boolean boolean12 = user9.checkPrivileges();
        user9.setType("hi!");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap15 = user9.rentedItems;
        user3.rentedItems = physicalItemMap15;
        java.lang.String str17 = user3.getType();
        boolean boolean18 = user3.getRE();
        york.eecs.bt.Newsletter newsletter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            user3.subscribe(newsletter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        int int5 = user3.countOverDue();
        java.lang.String str6 = user3.getPassword();
        boolean boolean7 = user3.checkPrivileges();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        boolean boolean6 = user3.getRE();
        user3.setEmail("");
        boolean boolean9 = user3.getRE();
        java.util.List<york.eecs.bt.Notification> notificationList10 = user3.getNotificationList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList10);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        york.eecs.bt.User user3 = new york.eecs.bt.User("hi!", "hi!", "hi!");
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        int int11 = user3.countLost();
        java.lang.String str12 = user3.getPassword();
        user3.setRentEligible((java.lang.Boolean) true);
        york.eecs.bt.PhysicalItem physicalItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = user3.rentItem(physicalItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        user3.setRentEligible((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        int int11 = user3.countLost();
        java.lang.String str12 = user3.getPassword();
        int int13 = user3.countOverDue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countOverDue();
        boolean boolean7 = user3.getRE();
        boolean boolean8 = user3.rentEligible;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        york.eecs.bt.User user3 = new york.eecs.bt.User("hi!", "", "hi!");
        user3.rentEligible = true;
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        java.util.List<york.eecs.bt.Notification> notificationList15 = user3.getNotificationList();
        user3.setType("");
        user3.setEmail("");
        java.util.List<york.eecs.bt.Newsletter> newsletterList20 = user3.listSubscription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList20);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        york.eecs.bt.User user18 = new york.eecs.bt.User("", "", "");
        user18.rentEligible = false;
        int int21 = user18.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList22 = user18.getNotificationList();
        user3.setNotificationList(notificationList22);
        java.lang.String str24 = user3.getEmail();
        york.eecs.bt.User user28 = new york.eecs.bt.User("", "", "");
        user28.viewTextbooks();
        java.lang.String str30 = user28.getType();
        york.eecs.bt.User user34 = new york.eecs.bt.User("", "", "");
        user34.rentEligible = false;
        boolean boolean37 = user34.checkPrivileges();
        user34.setType("hi!");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap40 = user34.rentedItems;
        user28.rentedItems = physicalItemMap40;
        user3.rentedItems = physicalItemMap40;
        int int43 = user3.countOverDue();
        java.util.List<york.eecs.bt.Notification> notificationList44 = user3.getNotificationList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList44);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        york.eecs.bt.User user18 = new york.eecs.bt.User("", "", "");
        user18.rentEligible = false;
        int int21 = user18.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList22 = user18.getNotificationList();
        user3.setNotificationList(notificationList22);
        java.lang.String str24 = user3.getEmail();
        boolean boolean25 = user3.checkPrivileges();
        boolean boolean26 = user3.rentEligible;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        java.util.List<york.eecs.bt.Notification> notificationList15 = user3.getNotificationList();
        user3.setType("");
        user3.rentEligible = true;
        user3.setEmail("");
        java.lang.String str22 = user3.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        user3.viewCourses();
        user3.setPassword("hi!");
        java.util.List<york.eecs.bt.Notification> notificationList9 = user3.getNotificationList();
        java.lang.String str10 = user3.getPassword();
        user3.setRentEligible((java.lang.Boolean) false);
        user3.setRentEligible((java.lang.Boolean) false);
        york.eecs.bt.User user18 = new york.eecs.bt.User("", "", "");
        user18.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList20 = user18.listSubscription();
        york.eecs.bt.User user24 = new york.eecs.bt.User("", "", "");
        user24.rentEligible = false;
        int int27 = user24.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList28 = user24.getNotificationList();
        user18.setNotificationList(notificationList28);
        java.util.List<york.eecs.bt.Notification> notificationList30 = user18.getNotificationList();
        user18.setType("hi!");
        user18.setPassword("hi!");
        york.eecs.bt.User user38 = new york.eecs.bt.User("", "", "");
        user38.rentEligible = false;
        int int41 = user38.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList42 = user38.getNotificationList();
        user18.setNotificationList(notificationList42);
        user3.setNotificationList(notificationList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList42);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        java.lang.String str6 = user3.getEmail();
        boolean boolean7 = user3.checkPrivileges();
        int int8 = user3.countRentSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        york.eecs.bt.User user18 = new york.eecs.bt.User("", "", "");
        user18.rentEligible = false;
        int int21 = user18.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList22 = user18.getNotificationList();
        user3.setNotificationList(notificationList22);
        java.lang.String str24 = user3.getEmail();
        york.eecs.bt.User user28 = new york.eecs.bt.User("", "", "");
        user28.viewTextbooks();
        java.lang.String str30 = user28.getType();
        york.eecs.bt.User user34 = new york.eecs.bt.User("", "", "");
        user34.rentEligible = false;
        boolean boolean37 = user34.checkPrivileges();
        user34.setType("hi!");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap40 = user34.rentedItems;
        user28.rentedItems = physicalItemMap40;
        user3.rentedItems = physicalItemMap40;
        java.lang.String str43 = user3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        boolean boolean6 = user3.checkPrivileges();
        user3.setType("hi!");
        int int9 = user3.countRentSize();
        user3.viewTextbooks();
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap11 = null;
        user3.rentedItems = physicalItemMap11;
        york.eecs.bt.PhysicalItem physicalItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            user3.unRentItem(physicalItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        user3.viewCourses();
        user3.setPassword("hi!");
        java.lang.String str9 = user3.getType();
        user3.setType("");
        york.eecs.bt.Course course12 = null;
        user3.addCourse(course12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countOverDue();
        java.lang.String str7 = user3.getType();
        java.util.List<york.eecs.bt.Newsletter> newsletterList8 = user3.listSubscription();
        java.util.List<york.eecs.bt.Notification> notificationList9 = user3.getNotificationList();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList9);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        double double11 = user3.calculatePenalty();
        java.util.List<york.eecs.bt.Newsletter> newsletterList12 = user3.listSubscription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList12);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        int int11 = user3.countLost();
        boolean boolean12 = user3.checkPrivileges();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList5 = user3.listSubscription();
        york.eecs.bt.User user9 = new york.eecs.bt.User("", "", "");
        user9.rentEligible = false;
        int int12 = user9.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList13 = user9.getNotificationList();
        user3.setNotificationList(notificationList13);
        york.eecs.bt.Newsletter newsletter15 = null;
        user3.cancel(newsletter15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList13);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        java.util.HashMap<york.eecs.bt.PhysicalItem, java.time.LocalDate> physicalItemMap4 = user3.rentedItems;
        double double5 = user3.calculatePenalty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(physicalItemMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        java.util.List<york.eecs.bt.Notification> notificationList4 = user3.getNotificationList();
        york.eecs.bt.User user8 = new york.eecs.bt.User("", "", "");
        user8.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList10 = user8.listSubscription();
        java.lang.String str11 = user8.getEmail();
        york.eecs.bt.Notification[] notificationArray12 = new york.eecs.bt.Notification[] {};
        java.util.ArrayList<york.eecs.bt.Notification> notificationList13 = new java.util.ArrayList<york.eecs.bt.Notification>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<york.eecs.bt.Notification>) notificationList13, notificationArray12);
        user8.setNotificationList((java.util.List<york.eecs.bt.Notification>) notificationList13);
        user3.setNotificationList((java.util.List<york.eecs.bt.Notification>) notificationList13);
        java.lang.String str17 = user3.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList7 = user3.getNotificationList();
        boolean boolean8 = user3.getRE();
        user3.setPassword("");
        java.util.List<york.eecs.bt.Notification> notificationList11 = user3.getNotificationList();
        york.eecs.bt.PhysicalItem physicalItem12 = null;
        user3.unRentItem(physicalItem12);
        java.lang.Class<?> wildcardClass14 = user3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.viewTextbooks();
        java.util.List<york.eecs.bt.Course> courseList5 = user3.getCourses();
        int int6 = user3.countLost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(courseList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        java.util.List<york.eecs.bt.Notification> notificationList4 = user3.getNotificationList();
        york.eecs.bt.Newsletter newsletter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            user3.subscribe(newsletter5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList4);
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test99");
        york.eecs.bt.User user3 = new york.eecs.bt.User("", "", "");
        user3.rentEligible = false;
        int int6 = user3.countLost();
        york.eecs.bt.User user10 = new york.eecs.bt.User("", "", "");
        user10.viewTextbooks();
        java.util.List<york.eecs.bt.Newsletter> newsletterList12 = user10.listSubscription();
        york.eecs.bt.User user16 = new york.eecs.bt.User("", "", "");
        user16.rentEligible = false;
        int int19 = user16.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList20 = user16.getNotificationList();
        user10.setNotificationList(notificationList20);
        java.util.List<york.eecs.bt.Notification> notificationList22 = user10.getNotificationList();
        user10.setType("hi!");
        user10.setPassword("hi!");
        york.eecs.bt.User user30 = new york.eecs.bt.User("", "", "");
        user30.rentEligible = false;
        int int33 = user30.countLost();
        java.util.List<york.eecs.bt.Notification> notificationList34 = user30.getNotificationList();
        user10.setNotificationList(notificationList34);
        user3.setNotificationList(notificationList34);
        boolean boolean37 = user3.checkPrivileges();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(newsletterList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(notificationList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }
}

