# Usage Instructions

## Running the Group Server

To start the Group Server:
 - Enter the directory containing `RunGroupServer.class`
 - Type `java RunGroupServer [port number]`

Note that the port number argument to `RunGroupServer` is optional.  This argument specifies the port that the Group Server will listen to.  If unspecified, it defaults to port 8765.

When the group server is first started, there are no users or groups. Since there must be an administer of the system, the user is prompted via the console to enter a username. This name becomes the first user and is a member of the *ADMIN* group.  No groups other than *ADMIN* will exist.

## Running the Host Server

To start the Host Server:
 - Enter the directory containing `RunHostServer.class`
 - Type `java RunHostServer [port number]`

Note that the port number argument to `RunHostServer is optional.  This argument speficies the port that the Host Server will list to. If unspecified, it defaults to port 4321.

The host server will create a shared_resources inside the working directory if one does not exist. The host server is now online.

## Resetting the Group or Host Server

To reset the Group Server, delete the files `UserList.bin` and `GroupList.bin`

To reset the Host Server, delete the `ResourceList.bin` file and the `shared_resources/` directory.