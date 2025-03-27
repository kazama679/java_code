package ss20.b10;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class B10 {
    public static void main(String[] args) {
        User u1 = new User(1, "Quý", "quy@example.com");
        User u2 = new User(2, "Lan", null);
        User u3 = new User(3, "Huyền", "huyen@example.com");
        List<User> users = List.of(u1, u2, u3);

        List<Task> tasks = List.of(
                new Task(1, "Viết báo cáo", u1, LocalDate.of(2025, 3, 20), false),
                new Task(2, "Thiết kế slide", u1, LocalDate.of(2025, 3, 25), true),
                new Task(3, "Họp nhóm", u2, LocalDate.of(2025, 3, 18), false),
                new Task(4, "Nộp tài liệu", u3, LocalDate.of(2025, 3, 22), true),
                new Task(5, "Chuẩn bị thuyết trình", u2, LocalDate.of(2025, 3, 19), true));

        System.out.println("In danh sách công việc quá hạn và chưa hoàn thành :");
        tasks.stream().filter(task->!task.isCompleted() && task.getDueDate().isBefore(LocalDate.of(2025, 3, 23)))
                .forEach(task -> System.out.println("- " + task.getTitle() + " (Giao cho: " + task.getAssignedTo().getName() + ", hạn chót: " + task.getDueDate() + ")"));

        System.out.println("Số công việc đã hoàn thành: "+tasks.stream().filter(Task::isCompleted).count());
        users.forEach(user-> System.out.printf("- Tên: %s | Email: %s | Tổng việc: %d | Quá hạn: %d\n", user.getName(), user.getEmail().orElse("Không có email"),
                tasks.stream().filter(task->task.getAssignedTo().getName().equals(user.getName())).count(),
                tasks.stream().filter(task -> task.getAssignedTo().equals(user) && !task.isCompleted() && task.getDueDate().isBefore(LocalDate.of(2025, 3, 23))).count()));
    }
}
