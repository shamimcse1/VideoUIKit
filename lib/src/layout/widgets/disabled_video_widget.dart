import 'package:flutter/material.dart';
import 'package:flutter_svg/flutter_svg.dart';

/// Widget that is displayed when local/remote video is disabled.
class DisabledVideoWidget extends StatefulWidget {
  const DisabledVideoWidget({super.key});

  @override
  State<DisabledVideoWidget> createState() => _DisabledVideoWidgetState();
}

class _DisabledVideoWidgetState extends State<DisabledVideoWidget> {
  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.black,
      padding: const EdgeInsets.all(8.0),
      child: Center(
          child: SvgPicture.asset("assets/images/app_logo.svg")),
    );
  }
}
