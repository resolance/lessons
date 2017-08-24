package ru.ezhov.lessons.homework.resolance.homework;

class House {

    private String common = "";
    private int size;
    private static int count = 0;
    private int result = 17;
    private int hashCode = 0;

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public House() {
        count++;
        System.out.println("Класс House: " + "\n" + "кол-во созданных экземпляров класса " + count);

    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof House)) {
            return false;
        }
        House checkHome = (House) object;
        if (checkHome.common == common && checkHome.size == size) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int converString = 0;

        /*if (!(common.length() == 0)) {
            for (int i = 0; i < common.length(); i++) {
                converString = converString + common.codePointAt(i);
            }
        }*/

        result = 37 * result + converString;
        result = 37 * result + size;
        result = 37 * result + common.hashCode();
        hashCode = result;
        return hashCode;
    }

}
