# TeamBoard - A simpe CLI based Project Management System

TeamBoard is a simple project management tool that lets users create and manage projects and teams. This has been created to learn software development concepts such as OOPS, Clean coding, Git & GitHub.

## Requirements:

1. User Management
- Users can exist in the system with basic identifying information.
- A user can participate in multiple projects.
- A user can have different roles in different projects.

2. Project / Board Management

- A project (board) represents a workspace for a team.
- Each project:
    - Has a name and description
    - Has one or more members
    - Has an owner
- Projects can be created, updated, and archived.

3. Lists (Workflow Stages)
- Each project contains multiple lists (e.g., “To Do”, “In Progress”, “Done”).
- Lists belong to exactly one project.
- Lists have an order/position within a project.

4. Tasks / Cards

- Tasks belong to exactly one list.
- Tasks have:
    - Title
    - Description
    - Status
    - Priority
    - Optional due date
    - Tasks can be moved between lists.
    - Tasks can be assigned to users.
    - Tasks can have comments.

5. Activity & History
Important actions should be trackable:
- Task creation
- Task movement
- Assignment changes
- History does not need to be editable.

6. Permissions (Simple)
- Only project members can interact with a project.
- Certain actions may be restricted to owners or admins.