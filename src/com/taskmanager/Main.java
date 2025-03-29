package com.taskmanager;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        TaskQueue taskQueue = new TaskQueue();
        TaskStack taskStack = new TaskStack();

        // Menambahkan tugas
        taskList.addTask("Belajar Java");
        taskList.addTask("Mengerjakan PR");
        taskList.addTask("Membaca buku");

        // Menampilkan daftar tugas
        taskList.showTasks();

        // Menambahkan tugas ke antrean (queue)
        taskQueue.addTask("Meeting dengan tim");
        taskQueue.addTask("Menyelesaikan laporan");
        taskQueue.processTask();

        // Menambahkan tugas ke tumpukan (stack)
        taskStack.addTask("Revisi dokumen");
        taskStack.addTask("Menulis artikel");
        taskStack.undoTask();
    }
}
