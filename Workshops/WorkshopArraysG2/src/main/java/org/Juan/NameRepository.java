package org.Juan;

import java.util.Arrays;

public class NameRepository {

    private static String[] names = new String[0];

    public static String find(final String fullName) {
        for (String name : names) {
            if (name.equals(fullName)) {
                return name;
            }
        }
        return null; // Name not found
    }

    public static boolean add(final String fullName) {
        for (String name : names) {
            if (name.equals(fullName)) {
                return false; // Name already exists
            }
        }

        String[] newNames = Arrays.copyOf(names, names.length + 1);
        newNames[names.length] = fullName;
        names = newNames;
        return true; // Name added successfully
    }

    public static String[] findByFirstName(final String firstName) {
        String[] matches = new String[0];
        for (String name : names) {
            String[] parts = name.split(" ");
            if (parts[0].equals(firstName)) {
                matches = Arrays.copyOf(matches, matches.length + 1);
                matches[matches.length - 1] = name;
            }
        }
        return matches;
    }

    public static String[] findByLastName(final String lastName) {
        String[] matches = new String[0];
        for (String name : names) {
            String[] parts = name.split(" ");
            if (parts[1].equals(lastName)) {
                matches = Arrays.copyOf(matches, matches.length + 1);
                matches[matches.length - 1] = name;
            }
        }
        return matches;
    }

    public static boolean update(final String original, final String updatedName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(original)) {
                for (int j = 0; j < names.length; j++) {
                    if (j != i && names[j].equals(updatedName)) {
                        return false; // An existing name matches the updatedName
                    }
                }
                names[i] = updatedName;
                return true; // Name updated successfully
            }
        }
        return false; // Name not found
    }

    public static boolean remove(final String fullName) {
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(fullName)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false; // Name not found
        } else {
            String[] newNames = new String[names.length - 1];
            System.arraycopy(names, 0, newNames, 0, index);
            System.arraycopy(names, index + 1, newNames, index, names.length - index - 1);
            names = newNames;
            return true; // Name removed successfully
        }
    }
}
