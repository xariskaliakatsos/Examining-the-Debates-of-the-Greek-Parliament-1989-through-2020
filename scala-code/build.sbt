name := "BigData"
version := "0.1"
scalaVersion := "2.12.10"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.1.2",
  "org.apache.spark" %% "spark-sql" % "3.1.2",
  "org.apache.spark" %% "spark-mllib" % "3.1.2" % "provided",
  "com.github.fommil.netlib" % "netlib-native_ref-linux-x86_64"    % "1.1",
  "com.github.fommil.netlib" % "netlib-native_ref-win-x86_64"      % "1.1",
  "com.github.fommil.netlib" % "netlib-native_ref-osx-x86_64"      % "1.1",
  "com.github.fommil.netlib" % "netlib-native_system-linux-x86_64" % "1.1",
  "com.github.fommil.netlib" % "netlib-native_system-win-x86_64"   % "1.1",
  "com.github.fommil.netlib" % "netlib-native_system-osx-x86_64"   % "1.1",
  "com.github.fommil.netlib" % "native_ref-java"                   % "1.1",
  "com.github.fommil.netlib" % "native_system-java"                % "1.1",
  "com.github.fommil.netlib" % "core"                              % "1.1.2",
  "com.github.fommil"        % "jniloader"                         % "1.1",
  "net.sourceforge.f2j"      % "arpack_combined_all"               % "0.1"
)