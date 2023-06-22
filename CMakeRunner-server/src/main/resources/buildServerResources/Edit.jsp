<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="l" tagdir="/WEB-INF/tags/layout" %>
<%@ taglib prefix="props" tagdir="/WEB-INF/tags/props"%>

<l:settingsGroup title="Build Settings">

    <tr>
        <th><label for="clean">Clean</label></th>
        <td>
            <props:checkboxProperty name="clean" value="false"></props:checkboxProperty>
            <span class="smallNote">Clean whole build directory before running CMake</span>
        </td>
    </tr>

    <tr>
        <th><label for="directory">Build Directory</label></th>
        <td>
            <props:textProperty name="directory"></props:textProperty>
            <span class="smallNote">Path to the directory to build the project</span>
        </td>
    </tr>

    <tr>
        <th><label for="cmake_directory">CMake Directory</label></th>
        <td>
            <props:textProperty name="cmake_directory"></props:textProperty>
            <span class="smallNote">Path where CMakeLists is (relative to build path)</span>
        </td>
    </tr>

    <tr>
        <th><label for="cmake_arguments">Arguments</label></th>
        <td>
            <div>
                <props:multilineProperty note="Put each argument in new line" expanded="true" name="cmake_arguments" linkTitle="Command line arguments for CMake" cols="30" rows="10">
                </props:multilineProperty>
            </div>
        </td>
    </tr>
</l:settingsGroup>