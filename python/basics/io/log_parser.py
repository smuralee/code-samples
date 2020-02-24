# Read the file and split into lines
with open('in/log.txt') as f_reader:
    file_contents = f_reader.read().splitlines()

# Remove all the empty lines
file_contents = filter(None, file_contents)

# Create a new file for writing the clean data
f_writer = open("out/log.txt", "w")

# List to store the lines
data = []

# Process the lines
for file_line in file_contents:
    if '#' in file_line:
        # Write to the cleaned data file as comma delimited
        f_writer.write('{}'.format(",".join(data)))
        f_writer.write('\n')
        data.clear()
    else:
        data.append(file_line)

# Close the file
f_writer.close()
