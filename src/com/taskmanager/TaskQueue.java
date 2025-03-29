package com.taskmanager;

import java.util.ArrayDeque;

public class TaskQueue {
    private ArrayDeque<String> taskQueue = new ArrayDeque<>();

    // Menambahkan tugas ke antrean
    public void addTask(String task) {
        taskQueue.offer(task);
        System.out.println("🔄 Tugas masuk antrean: " + task);
    }

    // Memproses tugas dari antrean (FIFO)
    public void processTask() {
        if (!taskQueue.isEmpty()) {
            System.out.println("✅ Memproses tugas: " + taskQueue.poll());
        } else {
            System.out.println("❌ Tidak ada tugas dalam antrean!");
        }
    }
}
