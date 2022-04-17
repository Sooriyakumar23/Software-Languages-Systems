% Day - 2

clc; % Clear command window
clear; % Clear workspace
close all; % Close all figures

rgb_image = imread('beast.png');
%subplot(1,2,1);
imshow(rgb_image);
impixelinfo; % (X, Y) [R, G, B]

info = dicominfo('sample_dicom.DCM');
dcm_image = dicomread(info);
%subplot(1,2,2);
figure, imshow(dcm_image, []);
