#!/bin/sh
PLAYVERSION=1.4.6

PLAYDIR=play1-$PLAYVERSION
if [ ! -d $PLAYDIR ]; then
  curl -L https://github.com/playframework/play1/archive/refs/tags/$PLAYVERSION.tar.gz -o play-$PLAYVERSION.tar.gz
  tar zxf play-$PLAYVERSION.tar.gz
  cd $PLAYDIR/framework
  ant 1>play1-build.log 2>&1
  mv play-`cat src/play/version`.jar play-$PLAYVERSION.jar
  echo $PLAYVERSION > src/play/version
fi
