package com.taskmanager;

import java.util.ArrayDeque;

public class TaskStack {
    private ArrayDeque<String> taskStack = new ArrayDeque<>();

    // Menambahkan tugas ke tumpukan
    public void addTask(String task) {
        taskStack.push(task);
        System.out.println("🆕 Tugas ditambahkan ke stack: " + task);
    }

    // Menghapus tugas terakhir yang ditambahkan (Undo)
    public void undoTask() {
        if (!taskStack.isEmpty()) {
            System.out.println("↩️ Undo tugas: " + taskStack.pop());
        } else {
            System.out.println("❌ Tidak ada tugas untuk di-undo!");
        }
    }
}
