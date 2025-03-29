package com.taskmanager;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<String> tasks = new ArrayList<>();

    // Menambahkan tugas ke daftar
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("✅ Tugas ditambahkan: " + task);
    }

    // Menampilkan semua tugas
    public void showTasks() {
        System.out.println("\n📌 Daftar Tugas:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}
