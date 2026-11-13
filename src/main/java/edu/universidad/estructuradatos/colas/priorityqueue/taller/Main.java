package edu.universidad.estructuradatos.colas.priorityqueue.taller;

public class Main{
    public static void main(String[] args) {
        CompanyTasks queue = new CompanyTasks();

        queue.addTask(new Task(101, "Atender incidente de seguridad", 1));
        queue.addTask(new Task(102, "Revisar conexión de red", 2));
        queue.addTask(new Task(103, "Actualizar sistema operativo", 3));
        queue.addTask(new Task(104, "Instalar software", 4));
        queue.addTask(new Task(105, "Realizar mantenimiento de equipos", 5));
        queue.addTask(new Task(106, "Reparar servidor principal", 1));
        queue.addTask(new Task(107, "Actualizar base de datos", 2));
        queue.addTask(new Task(108, "Verificar copias de seguridad", 3));
        queue.addTask(new Task(109, "Configurar impresoras", 4));
        queue.addTask(new Task(110, "Organizar inventario tecnológico", 5));
        queue.addTask(new Task(111, "Solucionar falla del servidor", 1));
        queue.addTask(new Task(112, "Revisar permisos de usuarios", 2));
        queue.addTask(new Task(113, "Documentar procedimientos", 3));
        queue.addTask(new Task(114, "Actualizar aplicaciones", 4));
        queue.addTask(new Task(115, "Revisar equipos de oficina", 5));
        queue.addTask(new Task(116, "Atender alerta de seguridad", 1));
        queue.addTask(new Task(117, "Optimizar base de datos", 2));
        queue.addTask(new Task(118, "Revisar conexiones", 3));
        queue.addTask(new Task(119, "Instalar actualizaciones", 4));
        queue.addTask(new Task(120, "Organizar archivos digitales", 5));

        System.out.println(queue.showTask());
        System.out.println(queue.withPriority());
        System.out.println(queue.withPriorityThree());
        System.out.println(queue.pollTask());
        System.out.println(queue.drop());
        System.out.println(queue.pendingTask());
       
        
    }
}